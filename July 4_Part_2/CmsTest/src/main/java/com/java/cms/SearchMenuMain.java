package com.java.cms;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SearchMenuMain {

	public static void main(String[] args) {
		int menuId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Menu Id   ");
		menuId = sc.nextInt();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/cms/jdbc.xml");
		MenuDAO dao = (MenuDAO)ctx.getBean("employDao");
		Menu menu = dao.searchByMenuId(menuId);
		if (menu!=null) {
			System.out.println(menu);
		} else {
			System.out.println("*** Record Not Found ***");
		}
		
	}
}
