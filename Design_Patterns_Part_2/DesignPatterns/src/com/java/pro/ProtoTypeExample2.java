package com.java.pro;

import java.util.Scanner;

public class ProtoTypeExample2 {

	public static void main(String[] args) {
		Bike bike = new Bike();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Company");
		bike.setCompany(sc.next());
		System.out.println("Enter Price   ");
		bike.setPrice(sc.nextDouble());
		System.out.println(bike);
		
		if (bike.getCompany().equals("Hero")) {
			Bike bikeNew = (Bike)bike.getClone();
			System.out.println(bikeNew);
		} else {
			Bike bikeNew = new Bike();
			System.out.println("Enter Company");
			bikeNew.setCompany(sc.next());
			System.out.println("Enter Price   ");
			bikeNew.setPrice(sc.nextDouble());
			System.out.println(bikeNew);
		}
	}
}
