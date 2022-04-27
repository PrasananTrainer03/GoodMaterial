package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {

	private int menId;
	private String menItem;
	private double menPrice;
	private double menCalories;
	private String menSpeciality;
	
	@Id
	public int getMenId() {
		return menId;
	}
	public void setMenId(int menId) {
		this.menId = menId;
	}
	public String getMenItem() {
		return menItem;
	}
	public void setMenItem(String menItem) {
		this.menItem = menItem;
	}
	public double getMenPrice() {
		return menPrice;
	}
	public void setMenPrice(double menPrice) {
		this.menPrice = menPrice;
	}
	public double getMenCalories() {
		return menCalories;
	}
	public void setMenCalories(double menCalories) {
		this.menCalories = menCalories;
	}
	public String getMenSpeciality() {
		return menSpeciality;
	}
	public void setMenSpeciality(String menSpeciality) {
		this.menSpeciality = menSpeciality;
	}
	
	
}
