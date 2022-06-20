package com.example.demo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {

	@Id
	private int bookingId;
	private Date bookingDate;
	private int userId;
	private int driverId;
	private String startingLocation;
	private String endingLocation;
	private double kilometers;
	private String bookingStatus;
	private double billAmount;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getStartingLocation() {
		return startingLocation;
	}
	public void setStartingLocation(String startingLocation) {
		this.startingLocation = startingLocation;
	}
	public String getEndingLocation() {
		return endingLocation;
	}
	public void setEndingLocation(String endingLocation) {
		this.endingLocation = endingLocation;
	}
	public double getKilometers() {
		return kilometers;
	}
	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public double getBookingAmount() {
		return billAmount;
	}
	public void setBookingAmount(double bookingAmount) {
		this.billAmount = bookingAmount;
	}
	
	public Booking() { }
	public Booking(int bookingId, Date bookingDate, int userId, int driverId, String startingLocation,
			String endingLocation, double kilometers, String bookingStatus, double bookingAmount) {
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.userId = userId;
		this.driverId = driverId;
		this.startingLocation = startingLocation;
		this.endingLocation = endingLocation;
		this.kilometers = kilometers;
		this.bookingStatus = bookingStatus;
		this.billAmount = bookingAmount;
	}
	
	
}
