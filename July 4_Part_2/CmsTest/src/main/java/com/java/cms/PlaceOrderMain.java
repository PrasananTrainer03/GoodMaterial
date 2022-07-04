package com.java.cms;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlaceOrderMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/cms/jdbc.xml");
		OrderDAO dao = (OrderDAO)ctx.getBean("orderDao");
		Orders orders = new Orders();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CustomerId  ");
		orders.setCustomerId(sc.nextInt());
		System.out.println("Enter VendorId  ");
		orders.setVendoId(sc.nextInt());
		System.out.println("Enter MenuId  ");
		orders.setMenuId(sc.nextInt());
		System.out.println("Enter WalletType  ");
		orders.setWalSource(sc.next());
		System.out.println("Enter Quantity to Order  ");
		orders.setOrderQuantity(sc.nextInt());
		System.out.println("Enter Order Comments   ");
		orders.setOrderComments(sc.next());
		System.out.println(dao.placeOrder(orders));
	}
}
