package com.java.ad;

import java.util.Scanner;

public class Maheswari extends HelpmateBankDetails implements Banking {

	@Override
	public void storeCustomerInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccountNo   ");
		setAccountNo(sc.nextInt());
		System.out.println("Enter AccountHolder Name   ");
		setAccountHolderName(sc.next());
		System.out.println("Enter Deposit Amount   ");
		setDepositAmount(sc.nextDouble());
		System.out.println("Enter Credit Card Number   ");
		setCreditCardNumber(sc.nextInt());
		System.out.println("Enter Credit Card Limit   ");
		setCreditLimit(sc.nextDouble());
		System.out.println("Installment Amount Paid   ");
		setInstallmentPaid(sc.nextDouble());
	}

	@Override
	public String printAllInfo() {
		return "Account No   " +getAccountNo() + " Account Holder Name  " +
				getAccountHolderName() + " Deposit Amount  " +getDepositAmount() + " Credit Card Number " +getCreditCardNumber() 
				 + " Card Limit  " +getCreditLimit() + " Installment Paid  " +getInstallmentPaid();
	}

}
