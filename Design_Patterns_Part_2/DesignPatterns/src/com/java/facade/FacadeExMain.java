package com.java.facade;

import java.util.Scanner;

public class FacadeExMain {
	public static void main(String[] args) {
		TrainingAdmin obj = new TrainingAdmin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course Name  ");
		String type = sc.next();
		if (type.equals("Premier")) {
			obj.premierMavericsRun();
		}
		if (type.equals("FullStack")) {
			obj.javaFullStackRun();
		}
		if (type.equals("Digital")) {
			obj.digitalFoundationRun();
		}
	}
	
}
