package com.java.pro;

public class Car implements Vehicle {

	private String company;
	private String model;
	private double price;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car() {}
	public Car(String company, String model, double price) {
		this.company = company;
		this.model = model;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", price=" + price + "]";
	}


	@Override
	public Vehicle getClone() {
		// TODO Auto-generated method stub
		return new Car(company, model, price);
	}

	
}
