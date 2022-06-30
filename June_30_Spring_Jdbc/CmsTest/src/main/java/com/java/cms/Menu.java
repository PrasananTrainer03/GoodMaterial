package com.java.cms;

public class Menu {

	private int menuId;
	private String menuItem;
	private double menuPrice;
	private int menuCalories;
	private String menuSpeciality;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}
	public double getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(double menuPrice) {
		this.menuPrice = menuPrice;
	}
	public int getMenuCalories() {
		return menuCalories;
	}
	public void setMenuCalories(int menuCalories) {
		this.menuCalories = menuCalories;
	}
	public String getMenuSpeciality() {
		return menuSpeciality;
	}
	public void setMenuSpeciality(String menuSpeciality) {
		this.menuSpeciality = menuSpeciality;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuItem=" + menuItem + ", menuPrice=" + menuPrice + ", menuCalories="
				+ menuCalories + ", menuSpeciality=" + menuSpeciality + "]";
	}
	
	
}
