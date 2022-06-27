package com.java.employ;

import java.util.List;
import java.util.Scanner;

public class EmployMain {

	static Scanner sc = new Scanner(System.in);
	private static EmployBAL bal;
	
//	public static EmployBal = new EmployBAL();
	
	public static EmployBAL getInstance() {
		if (bal==null) {
			bal = EmployBAL.getInstance();
		}
		return bal;
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println(" O P T I O N S");
			System.out.println(" --------------");
			System.out.println(" 1. Add Employ");
			System.out.println(" 2. Show Employ");
			System.out.println(" 3. Search Employ");
			System.out.println(" 4. Delete Employ");
			System.out.println(" 5. Update Employ");
			System.out.println(" 6. Exit");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				try {
					addEmployMain();
				} catch (EmployException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2 : 
				showEmployMain();
				break;
			case 3 : 
				searchEmployMain();
				break;
			case 4 : 
				deleteEmployMain();
				break;
			case 5 : 
				try {
					updateEmployMain();
				} catch (EmployException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 6 : 
				return;
			}
		} while(choice!=6);
	}
	
	public static void deleteEmployMain() {
		bal = EmployMain.getInstance();
		int empno;
		System.out.println("Enter Employ Number   ");
		empno=sc.nextInt();
		System.out.println(bal.deleteEmployBal(empno));
	}
	
	public static void searchEmployMain() {
		bal = EmployMain.getInstance();
		int empno;
		System.out.println("Enter Employ Number   ");
		empno=sc.nextInt();
		Employ employ = bal.searchEmployBal(empno);
		if (employ!=null) {
			System.out.println(employ);
		} else {
			System.out.println("Employ Record Not Found...");
		}
	}
	public static void showEmployMain() {
		bal = EmployMain.getInstance();
		List<Employ> employList = bal.showEmployBal();
		
		System.out.println("Employ List is  ");
		for (Employ e : employList) {
			System.out.println(e);
		}
	}

	public static void updateEmployMain() throws EmployException {
		bal = EmployMain.getInstance();
		Employ employ = new Employ();
		System.out.println("Enter Employ Number  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Name   ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (MALE or FEMALE)  ");
		String gen = sc.next();
		if (gen.equals("MALE")) {
			employ.setGender(Gender.MALE);
		}
		if (gen.equals("FEMALE")) {
			employ.setGender(Gender.FEMALE);
		}
		System.out.println("Enter Department   ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation   ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic   ");
		employ.setBasic(sc.nextDouble());
		System.out.println(bal.updateEmployBal(employ));
	}

	
	public static void addEmployMain() throws EmployException {
		bal = EmployMain.getInstance();
		Employ employ = new Employ();
		System.out.println("Enter Employ Number  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Name   ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (MALE or FEMALE)  ");
		String gen = sc.next();
		if (gen.equals("MALE")) {
			employ.setGender(Gender.MALE);
		}
		if (gen.equals("FEMALE")) {
			employ.setGender(Gender.FEMALE);
		}
		System.out.println("Enter Department   ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation   ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic   ");
		employ.setBasic(sc.nextDouble());
		System.out.println(bal.addEmployBal(employ));
	}
}
