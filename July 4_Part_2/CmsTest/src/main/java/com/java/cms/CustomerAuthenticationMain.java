package com.java.cms;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerAuthenticationMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/cms/jdbc.xml");
		CustomerDAO dao= (CustomerDAO)ctx.getBean("customerDao");
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName and Password  ");
		user = sc.next();
		pwd = sc.next();
		String count = dao.customerAuthentication(user, pwd);
		System.out.println(count);
		int c = Integer.parseInt(count);
		if (c==1) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
