package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/Person.xml");
		Person person1 = (Person)ctx.getBean("beanPrathamesh");
		System.out.println(person1.showAllInfo());
		Person person2 = (Person)ctx.getBean("beanKavya");
		System.out.println(person2.showAllInfo());
		Person person3 = (Person)ctx.getBean("beanMaheswari");
		System.out.println(person3.showAllInfo());
	}
}
