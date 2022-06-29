package com.java.spr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/Hello.xml");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss aa");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date (yyyy-MM-dd:hh:mm:ss AM/PM");
		String date = sc.nextLine();
		System.out.println(date);
		Date dt = sdf.parse(date);
		//Date dt = new Date();
		int hrs = dt.getHours();
		System.out.println(hrs);
		if (hrs < 12) {
			HelloImpl hello = (HelloImpl)ctx.getBean("bean1");
			System.out.println(hello.sayHello("Subham"));
		}
		if (hrs >= 12 && hrs < 16) {
			HelloImpl hello = (HelloImpl)ctx.getBean("bean2");
			System.out.println(hello.sayHello("Subham"));
		}
		
	}
}
