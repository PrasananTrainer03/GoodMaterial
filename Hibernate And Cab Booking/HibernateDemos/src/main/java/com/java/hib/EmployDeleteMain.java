package com.java.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployDeleteMain {

	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmployNo   ");
		empno=sc.nextInt();
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("from Employ where empno="+empno);
		List<Employ> employList = query.list();
		Employ employ = employList.get(0);
		if (employ!=null) {
			session.delete(employ);
			t.commit();
			System.out.println("*** Record Deleted ***");
		}
	}
}
