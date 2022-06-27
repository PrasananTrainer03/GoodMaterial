package com.java.ad;

import java.util.Scanner;

public class Bavish extends HelpMate implements AgentDetails {

	@Override
	public void storePersonalDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AgentName and City  ");
		setAgentName(sc.next());
		setCity(sc.next());
	}

	@Override
	public String getPremiumAndPersonalDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PolicyName and Premium Amount   ");
		setPolicyName(sc.next());
		setPremiumAmount(sc.nextDouble());
		return "Agent Name  " +getAgentName() + " Agent City  " +getCity() + 
				" Policy Name  " +getPolicyName() + " Premium " +getPremiumAmount();
		//System.out.println("Policy Name  " +getPolicyName() + " Premium  " +getPremiumAmount());
	}

}
