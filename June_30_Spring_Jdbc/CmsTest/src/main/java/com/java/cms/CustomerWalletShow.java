package com.java.cms;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerWalletShow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id");
		int cid = sc.nextInt();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/cms/jdbc.xml");
		WalletDAO wdao = (WalletDAO)ctx.getBean("walletDao");
		List<Wallet> walletList = wdao.showCustomerWallet(cid);
		for (Wallet wallet : walletList) {
			System.out.println(wallet);
		}
	}
}
