package com.java.cms;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SearchByWalType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String walType;
		int cid;
		System.out.println("Enter WalletType   ");
		walType=sc.next();
		System.out.println("Enter CustId  ");
		cid= sc.nextInt();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/cms/jdbc.xml");
		WalletDAO wdao = (WalletDAO)ctx.getBean("walletDao");
		Wallet wallet = wdao.searchByWalletType(walType, cid);
		System.out.println(wallet);
	}
}
