package com.java.pro;

public class Bike implements Vehicle {

	private String company;
	private double price;
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Bike() {}
	
	public Bike(String company, double price) {
		this.company = company;
		this.price = price;
	}
	@Override
	public Vehicle getClone() {
		return new Bike(company, price);
	}

	@Override
	public String toString() {
		return "Bike [company=" + company + ", price=" + price + "]";
	}

	
}
