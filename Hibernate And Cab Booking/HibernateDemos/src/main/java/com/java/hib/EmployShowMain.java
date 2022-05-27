package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployShowMain {

	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration();
		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Employ");
		List<Employ> employList = query.list();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
