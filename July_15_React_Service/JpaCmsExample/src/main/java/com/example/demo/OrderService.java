package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderService {

	@Autowired 
	OrderRepository repo;
	
	public List<Orders> showCustomerPendingOrders(int cusId) {
		return repo.findCustomerPendingOrders(cusId);
	}
	
	public List<Orders> showVendorPendingOrders(int venId) {
		return repo.findVendorPendingOrders(venId);
	}
	
	public List<Orders> showCustomerOrders(int custId) {
		return repo.findCustomersByCusId(custId);
	}
	
	public List<Orders> showVendorOrders(int venId) {
		return repo.findVendorsByVenId(venId);
	}
}
