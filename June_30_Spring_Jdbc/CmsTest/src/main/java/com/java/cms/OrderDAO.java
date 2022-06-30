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
