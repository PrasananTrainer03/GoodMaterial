package com.java.spr;

public class HelloImpl implements Hello {

	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return greeting+name;
	}
	
	
}
