package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	private int empId;
	private String empName;
	private String empEmail;
	private String empMobile;
	private String empDptName;
	private Date empDateOfJoin;
	private int empMgrId;
	private int empLeaveBalance;
	
	@Id
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}
	public String getEmpDptName() {
		return empDptName;
	}
	public void setEmpDptName(String empDptName) {
		this.empDptName = empDptName;
	}
	public Date getEmpDateOfJoin() {
		return empDateOfJoin;
	}
	public void setEmpDateOfJoin(Date empDateOfJoin) {
		this.empDateOfJoin = empDateOfJoin;
	}
	public int getEmpMgrId() {
		return empMgrId;
	}
	public void setEmpMgrId(int empMgrId) {
		this.empMgrId = empMgrId;
	}
	public int getEmpLeaveBalance() {
		return empLeaveBalance;
	}
	public void setEmpLeaveBalance(int empLeaveBalance) {
		this.empLeaveBalance = empLeaveBalance;
	}
	
	
}
