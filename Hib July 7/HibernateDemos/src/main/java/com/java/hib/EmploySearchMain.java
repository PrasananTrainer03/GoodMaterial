package com.java.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmploySearchMain {

	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number  ");
		empno = sc.nextInt();
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Query query =s.createQuery("from Employ where empno="+empno);
		List<Employ> employList = query.list();
		if (employList.size()==0) {
			System.out.println("Record Not Found");
		} else {
			Employ employ = employList.get(0);
			System.out.println(employ);
		}
	}
}
