package com.java.facade;

public class TrainingAdmin {

	private DigitalFoundation digitalFoundation;
	private JavaFullStack javaFullStack;
	private PremierMaverics premierMaverics;
	
	public TrainingAdmin() {
		this.digitalFoundation = new DigitalFoundation();
		this.javaFullStack = new JavaFullStack();
		this.premierMaverics = new PremierMaverics();
	}
	
	public void digitalFoundationRun() {
		System.out.println(digitalFoundation.topic());
		System.out.println(digitalFoundation.duration());
		System.out.println(digitalFoundation.trainerInfo());
	}
	
	public void premierMavericsRun() {
		System.out.println(premierMaverics.topic());
		System.out.println(premierMaverics.duration());
		System.out.println(premierMaverics.trainerInfo());
	}
	
	public void javaFullStackRun() {
		System.out.println(javaFullStack.topic());
		System.out.println(javaFullStack.duration());
		System.out.println(javaFullStack.trainerInfo());
	}
}
