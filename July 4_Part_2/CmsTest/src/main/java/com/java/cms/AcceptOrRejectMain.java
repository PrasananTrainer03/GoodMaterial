package com.java.cms;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AcceptOrRejectMain {

	public static void main(String[] args) {
		int orderId, vendorId;
		String status;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Order Id  ");
		orderId = sc.nextInt();
		System.out.println("Enter Vendor Id   ");
		vendorId = sc.nextInt();
		System.out.println("Enter Status (YES/NO) ");
		status = sc.next();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/cms/jdbc.xml");
		OrderDAO dao = (OrderDAO)ctx.getBean("orderDao");
		System.out.println(dao.acceptOrReject(orderId, vendorId, status));
	}
}
