package com.java.ad;

public class AdapterExample {

	public static void main(String[] args) {
		AgentDetails obj = new Bavish();
		obj.storePersonalDetails();
		System.out.println(obj.getPremiumAndPersonalDetails());
	}
}
