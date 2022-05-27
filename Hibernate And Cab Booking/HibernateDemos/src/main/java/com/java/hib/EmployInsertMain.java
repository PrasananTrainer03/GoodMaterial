package com.java.hib;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployInsertMain {

	public static void main(String[] args) {
		Employ employ = new Employ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number   ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Name   ");
		employ.setName(sc.next());
		System.out.println("Enter Gender   ");
		employ.setGender(sc.next());
		System.out.println("Enter Department   ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation   ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic   ");
		employ.setBasic(sc.nextInt());
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.save(employ);
		t.commit();
		System.out.println("*** Record Inserted ***");
	}
	
}
