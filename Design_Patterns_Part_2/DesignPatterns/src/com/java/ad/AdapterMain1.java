package com.java.ad;

public class AdapterMain1 {

	public static void main(String[] args) {
		Banking obj = new Akash();
		obj.storeCustomerInfo();
		System.out.println(obj.printAllInfo());
	}
}
