package com.java.hib.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionHelper {

	public static SessionFactory getFactory() {
		
		return new AnnotationConfiguration().configure().buildSessionFactory();
	}
}
