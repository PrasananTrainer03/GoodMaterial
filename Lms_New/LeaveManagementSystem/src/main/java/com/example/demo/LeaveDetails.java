package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeaveDetails {

	private int leaveId;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private int leaveNoOfDays;
	private String leaveReason;
	private LeaveType leaveType;
	private LeaveStatus leaveStatus;
	private Date leaveAppliedOn;
	private String leaveManagerComments;
	private int empId;
	
	@Id
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public Date getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public Date getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public int getLeaveNoOfDays() {
		return leaveNoOfDays;
	}
	public void setLeaveNoOfDays(int leaveNoOfDays) {
		this.leaveNoOfDays = leaveNoOfDays;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	public LeaveType getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}
	public LeaveStatus getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(LeaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public Date getLeaveAppliedOn() {
		return leaveAppliedOn;
	}
	public void setLeaveAppliedOn(Date leaveAppliedOn) {
		this.leaveAppliedOn = leaveAppliedOn;
	}
	public String getLeaveManagerComments() {
		return leaveManagerComments;
	}
	public void setLeaveManagerComments(String leaveManagerComments) {
		this.leaveManagerComments = leaveManagerComments;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public LeaveDetails(int leaveId, Date leaveStartDate, Date leaveEndDate, int leaveNoOfDays, String leaveReason,
			LeaveType leaveType, LeaveStatus leaveStatus, Date leaveAppliedOn, String leaveManagerComments, int empId) {
		super();
		this.leaveId = leaveId;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.leaveNoOfDays = leaveNoOfDays;
		this.leaveReason = leaveReason;
		this.leaveType = leaveType;
		this.leaveStatus = leaveStatus;
		this.leaveAppliedOn = leaveAppliedOn;
		this.leaveManagerComments = leaveManagerComments;
		this.empId = empId;
	}
	public LeaveDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LeaveDetails [leaveId=" + leaveId + ", leaveStartDate=" + leaveStartDate + ", leaveEndDate="
				+ leaveEndDate + ", leaveNoOfDays=" + leaveNoOfDays + ", leaveReason=" + leaveReason + ", leaveType="
				+ leaveType + ", leaveStatus=" + leaveStatus + ", leaveAppliedOn=" + leaveAppliedOn
				+ ", leaveManagerComments=" + leaveManagerComments + ", empId=" + empId + "]";
	}
	
	
}
