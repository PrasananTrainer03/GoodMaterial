package com.java.ad;

public class HelpmateBankDetails {

	private int accountNo;
	private String accountHolderName;
	private double depositAmount;
	private int creditCardNumber;
	private double creditLimit;
	private double installmentPaid;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public int getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public double getInstallmentPaid() {
		return installmentPaid;
	}
	public void setInstallmentPaid(double installmentPaid) {
		this.installmentPaid = installmentPaid;
	}
	
	@Override
	public String toString() {
		return "HelpmateBankDetails [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName
				+ ", depositAmount=" + depositAmount + ", creditCardNumber=" + creditCardNumber + ", creditLimit="
				+ creditLimit + ", installmentPaid=" + installmentPaid + "]";
	}
	
	
}
