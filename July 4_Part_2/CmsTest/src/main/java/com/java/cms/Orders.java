package com.java.cms;

public class Orders {

	private int orderId;
	private int customerId;
	private int vendoId;
	private int menuId;
	private String walSource;
	private int orderQuantity;
	private double billAmount;
	private String orderComments;
	private OrderStatus orderStatus;
	
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getVendoId() {
		return vendoId;
	}
	public void setVendoId(int vendoId) {
		this.vendoId = vendoId;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getWalSource() {
		return walSource;
	}
	public void setWalSource(String walSource) {
		this.walSource = walSource;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public String getOrderComments() {
		return orderComments;
	}
	public void setOrderComments(String orderComments) {
		this.orderComments = orderComments;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerId=" + customerId + ", vendoId=" + vendoId + ", menuId="
				+ menuId + ", walSource=" + walSource + ", orderQuantity=" + orderQuantity + ", billAmount="
				+ billAmount + ", orderComments=" + orderComments + ", orderStatus=" + orderStatus + "]";
	}
	
	
}
