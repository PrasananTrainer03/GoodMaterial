package com.java.spr;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateNew {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date  (yyyy-MM-dd hh:mm:ss AM/PM");
		String input = sc.nextLine().trim();
		System.out.println(input);
		//String input = "23/12/2014 12:22:12 PM";
	      //Format of the date defined in the input String
	      DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
	      //Desired format: 24 hour format: Change the pattern as per the need
	      DateFormat outputformat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
	      Date date = null;
	      String output = null;
	      try{
	         //Converting the input String to Date
	    	 date= df.parse(input);
	         //Changing the format of date and storing it in String
	    	 output = outputformat.format(date);
	         //Displaying the date
	    	 System.out.println(output);
	      }catch(ParseException pe){
	         pe.printStackTrace();
	       }
	}
}
