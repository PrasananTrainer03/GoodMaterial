package com.java.jdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateEmployMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ employ = new Employ();
		System.out.println("Enter Employ Number   ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Name   ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE)  ");
		String gen = sc.next();
		if (gen.equals("MALE")) {
			employ.setGender(Gender.MALE);
		} else {
			employ.setGender(Gender.FEMALE);
		}
		System.out.println("Enter Department   ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic   ");
		employ.setBasic(sc.nextInt());
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/jdbc/jdbc.xml");
		EmployDAO dao = (EmployDAO)ctx.getBean("employDao");
		System.out.println(dao.updateEmploy(employ));
	}
}
