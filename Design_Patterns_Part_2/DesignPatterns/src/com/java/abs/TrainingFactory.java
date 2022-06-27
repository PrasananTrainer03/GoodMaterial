package com.java.abs;

public class TrainingFactory extends AbstractFactory {

	@Override
	public Training getDetails(String type) {
		if (type.equals("Digital")) {
			return new DigitalFoundation();
		}
		if (type.equals("Premier")) {
			return new PremierMaverics();
		}
		if (type.equals("FullStack")) {
			return new JavaFullStack();
		}
		return null;
	}

	
}
