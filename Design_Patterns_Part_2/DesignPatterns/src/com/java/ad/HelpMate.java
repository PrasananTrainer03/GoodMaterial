package com.java.ad;

public class HelpMate {

	private String agentName;
	private String city;
	private String policyName;
	private double premiumAmount;
	
	
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public double getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	
	@Override
	public String toString() {
		return "PremiumDetails [policyName=" + policyName + ", premiumAmount=" + premiumAmount + "]";
	}
	
	
}
