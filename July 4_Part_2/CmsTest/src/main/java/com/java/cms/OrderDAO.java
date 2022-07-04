package com.java.cms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class OrderDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Orders searchByOrderId(int orderId) {
		String cmd = "select * from Orders where Ord_Id=?";
		List<Orders> ordersList = jdbcTemplate.query(cmd, new Object[] {orderId}, new RowMapper<Orders>() {

			@Override
			public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
				Orders orders = new Orders();
				orders.setOrderId(rs.getInt("ORD_ID"));
				orders.setMenuId(rs.getInt("MEN_ID"));
				orders.setVendoId(rs.getInt("VEN_ID"));
				orders.setCustomerId(rs.getInt("CUS_ID"));
				orders.setWalSource(rs.getString("WAL_SOURCE"));
				orders.setOrderQuantity(rs.getInt("ORD_QUANTITY"));
				orders.setBillAmount(rs.getInt("ORD_BILLAMOUNT"));
				orders.setOrderStatus(OrderStatus.valueOf(rs.getString("ORD_STATUS")));
				orders.setOrderComments(rs.getString("ORD_COMMENTS"));
				return orders;
			}
		});
		return ordersList.get(0);
	}

	
	public List<Orders> customerOrders(int custId) {
		String cmd = "select * from Orders where Cus_id=?";
		List<Orders> ordersList = jdbcTemplate.query(cmd, new Object[] {custId}, new RowMapper<Orders>() {

			@Override
			public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
				Orders orders = new Orders();
				orders.setOrderId(rs.getInt("ORD_ID"));
				return orders;
			}
		});
		return ordersList;
	}
	
	public Menu searchByMenuId(int menuId) {
		String cmd ="select * from Menu where MEN_ID=?";
		List<Menu> menuList = jdbcTemplate.query(cmd, new Object[] {menuId}, new RowMapper<Menu>() {

			@Override
			public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
				Menu menu = new Menu();
				menu.setMenuId(rs.getInt("Men_ID"));
				menu.setMenuItem(rs.getString("MEN_ITEM"));
				menu.setMenuPrice(rs.getDouble("MEN_PRICE"));
				menu.setMenuCalories(rs.getInt("MEN_CALORIES"));
				menu.setMenuSpeciality(rs.getString("MEN_SPECIALITY"));
				return menu;
			}
		});
		if (menuList.size()==1) {
			return menuList.get(0);
		}
		return null;
	}
	
	public Wallet searchByWalletType(String walType,int cusId) {
		String cmd = "select * from wallet where wal_source=? and Cus_ID=?";
		List<Wallet> walletList = jdbcTemplate.query(cmd, new Object[] {walType,cusId},  new RowMapper<Wallet>() {

			@Override
			public Wallet mapRow(ResultSet rs, int rowNum) throws SQLException {
				Wallet wallet = new Wallet();
				wallet.setCustId(rs.getInt("Cus_ID"));
				wallet.setWalletId(rs.getInt("WAL_ID"));
				wallet.setWalSource(WalSource.valueOf(rs.getString("WAL_SOURCE")));
				wallet.setWalAmount(rs.getDouble("WAL_AMOUNT"));
				return wallet;
			}
		});
		return walletList.get(0);
	}
	
	public String acceptOrReject(int orderId, int vendorId, String status) {
		Orders orders = searchByOrderId(orderId);
		String walSource = orders.getWalSource();
		double billAmount = orders.getBillAmount();
		if (orders.getVendoId()!=vendorId) {
			return "You are not an Authorized Vendor to Accept the Order...";
		}
		if (status.equals("YES")) {
			String cmd = "Update Orders set ORD_STATUS='ACCEPTED' WHERE ORD_ID=?";
			jdbcTemplate.update(cmd, new Object[] {orderId});
			return "Order Accepted Successfully...";
		} else {
			String cmd = "Update Orders set ORD_STATUS='DENIED' WHERE ORD_ID=?";
			jdbcTemplate.update(cmd, new Object[] {orderId});
			cmd = "Update Wallet SET WAL_AMOUNT=WAL_AMOUNT+? WHERE CUS_ID=? AND "
					+ " WAL_SOURCE=?";
			jdbcTemplate.update(cmd, new Object[] {billAmount, orders.getCustomerId(), walSource});
			return "Order Rejected and Amount Refunded Successfully...";
		}
	}
	public String placeOrder(Orders order) {
		Menu menu = searchByMenuId(order.getMenuId());
		double price = menu.getMenuPrice();
		double billAmount = order.getOrderQuantity() * price;
		Wallet wallet = searchByWalletType(order.getWalSource(), order.getCustomerId());
		double balance = wallet.getWalAmount();
		if (billAmount > balance) {
			return "Insufficeint Funds...";
		}
		order.setOrderStatus(OrderStatus.PENDING);
		order.setBillAmount(billAmount);
		String cmd = "Insert into Orders(Cus_ID,Ven_ID,WAL_SOURCE,MEN_ID,ORD_QUANTITY,ORD_BILLAMOUNT,"
				+ "ORD_STATUS,ORD_COMMENTS) values(?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {order.getCustomerId(), order.getVendoId(), order.getWalSource(), 
						order.getMenuId(), order.getOrderQuantity(), order.getBillAmount(), order.getOrderStatus().toString(),
						order.getOrderComments()
					});
		cmd = "UPDATE WALLET SET WAL_AMOUNT=WAL_AMOUNT-? WHERE CUS_ID=? AND WAL_SOURCE=?";
		jdbcTemplate.update(cmd, new Object[] {billAmount, order.getCustomerId(), order.getWalSource()});
		return "Order Placed Successfully...";
	}
}
