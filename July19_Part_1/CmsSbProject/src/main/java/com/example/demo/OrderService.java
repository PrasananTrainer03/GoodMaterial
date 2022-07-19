package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderService {

	@Autowired
    private OrderRepository repo;
	
	@Autowired
	private OrderDAO dao;
	
	@Autowired 
	private MenuDAO mdao;
	
	@Autowired 
	private WalletDAO wdao;
	
	@Autowired
	private OrderDAO odao;
	
	public String acceptOrRejectOrder(int ordId,int venId,String status) {
		Orders orders = odao.searchByOrderId(ordId);
		int vid = orders.getVenId();
		int cid = orders.getCusId();
		String walType = orders.getWalSource();
		double billAmount = orders.getOrdBillamount();
		if (vid!=venId) {
			return "You are unauthorized vendor...";
		} 
		if (status.toUpperCase().equals("YES")) {
			return odao.updateStatus(ordId,"ACCEPTED");
		} else {
			odao.updateStatus(ordId, "DENIED");
			wdao.refundWallet(cid, walType, billAmount);
			return "Order Rejected and Amount Refunded...";
		}
	}
	public String placeOrder(Orders order) {
		Menu menu = mdao.searchMenu(order.getMenId());
		Wallet wallet = wdao.showCustomerWallet(order.getCusId(), order.getWalSource());
		double balance = wallet.getWalAmount();
		double billAmount = order.getOrdQuantity()*menu.getMenPrice();
		System.out.println(balance);
		System.out.println(billAmount);
		if (balance-billAmount > 0) {
			order.setOrdStatus("PENDING");
			order.setOrdBillamount(order.getOrdQuantity()*menu.getMenPrice());
			repo.save(order);
			wdao.updateWallet(order.getCusId(), order.getWalSource(), billAmount);
			return "Order Placed Successfully...and Amount Debited";
		}
		return "Insufficient Funds...";
	}
	
	public List<Orders> showVendorPendingOrders(int venId) {
		return dao.showVendorPendingOrders(venId);
	}
	public List<Orders> showVendorOrders(int venId) {
		return dao.showVendorOrders(venId);
	}
	public List<Orders> showCustomerOrders(int custId) {
		return dao.showCustomerOrders(custId);
	}
	public List<Orders> showCustomerPendingOrders(int custId) {
		return dao.showCustomerPendingOrders(custId);
	}
	public Orders search(int orderId) {
		return repo.findById(orderId).get();
	}
	public List<Orders> showOrders() {
		return repo.findAll();
	}
}
