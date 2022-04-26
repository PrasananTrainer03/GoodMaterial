package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	private int cusId;
	private String cusName;
	private String cusPhnNo;
	private String cusUsername;
	
	@Id
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusPhnNo() {
		return cusPhnNo;
	}
	public void setCusPhnNo(String cusPhnNo) {
		this.cusPhnNo = cusPhnNo;
	}
	public String getCusUsername() {
		return cusUsername;
	}
	public void setCusUsername(String cusUsername) {
		this.cusUsername = cusUsername;
	}
	public Customer(int cusId, String cusName, String cusPhnNo, String cusUsername) {
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusPhnNo = cusPhnNo;
		this.cusUsername = cusUsername;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
}
