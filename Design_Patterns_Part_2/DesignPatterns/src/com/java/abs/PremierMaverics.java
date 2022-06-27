package com.java.abs;

public class PremierMaverics implements Training {

	public final String topic;
	
	public PremierMaverics() {
		topic="Premier Maverics Topic Java/Spring-Hibernate/Angular/Microservices";
	}
	@Override
	public String getTrainingDetails() {
		return topic;
	}
}
