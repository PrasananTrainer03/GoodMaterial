package com.java.cms;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShowMenuMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/cms/jdbc.xml");
		MenuDAO dao = (MenuDAO)ctx.getBean("employDao");
		List<Menu> menuList = dao.showMenu();
		for (Menu menu : menuList) {
			System.out.println(menu);
		}
	}
}
