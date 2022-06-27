package com.java.pro;

import java.util.Scanner;

public class ProtoTypeExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car car = new Car();
		System.out.println("Enter Company   ");
		car.setCompany(sc.next());
		System.out.println("Enter Model   ");
		car.setModel(sc.next());
		System.out.println("Enter Price   ");
		car.setPrice(sc.nextDouble());
		System.out.println(car);
		
		if (car.getModel().equals("Baleno")) {
			Car carNew = (Car)car.getClone();
			System.out.println(carNew);
		} else {
			Car carNew = new Car();
			System.out.println("Enter Company   ");
			car.setCompany(sc.next());
			System.out.println("Enter Model   ");
			car.setModel(sc.next());
			System.out.println("Enter Price   ");
			car.setPrice(sc.nextDouble());
			System.out.println(car);
		}
	}
}
