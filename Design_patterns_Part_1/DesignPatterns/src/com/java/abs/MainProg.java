package com.java.abs;

import java.util.Scanner;

public class MainProg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Training Name   ");
		String type = sc.next();
		AbstractFactory tf = new TrainingFactory();
		Training t = tf.getDetails(type);
		if (t!=null) {
			System.out.println(t.getTrainingDetails());
		}
	}
}
