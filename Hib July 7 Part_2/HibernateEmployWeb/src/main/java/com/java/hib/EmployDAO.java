package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployDAO {

	public List<Employ> showEmploy() {
		SessionFactory sf = SessionHelper.getFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Employ");
		List<Employ> employList = query.list();
		return employList;
	}
}
