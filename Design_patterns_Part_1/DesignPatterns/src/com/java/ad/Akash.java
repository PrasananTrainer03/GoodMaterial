package com.java.ad;

import java.util.Scanner;

public class Akash extends HelpmateBankDetails implements Banking {

	@Override
	public void storeCustomerInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No   ");
		setAccountNo(sc.nextInt());
		System.out.println("Enter Account Holder Name   ");
		setAccountHolderName(sc.next());
		System.out.println("Enter Deposit Amount   ");
		setDepositAmount(sc.nextDouble());
	}

	@Override
	public String printAllInfo() {
		return "Account No   " +getAccountNo() + " Account Holder Name  " +
					getAccountHolderName() + " Deposit Amount  " +getDepositAmount();
	}

}
