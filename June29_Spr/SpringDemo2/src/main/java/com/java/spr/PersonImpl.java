package com.java.spr;

public class PersonImpl implements Person {

	private String id;
	private String name;
	private String aadharId;
	private String passportId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public String getPassportId() {
		return passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	@Override
	public String showAllInfo() {
		// TODO Auto-generated method stub
		return "Person Id " +id + " Name " +name 
					+ " Aadhar " +aadharId + " PassportId  " +passportId;
	}
	
	
}
