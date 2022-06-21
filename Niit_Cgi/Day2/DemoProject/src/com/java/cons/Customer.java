package com.java.cons;

public class Customer {

    int custId;
    String custName;
    Gender gender;
    double premium;
    int payMode;

    public Customer() { }

    public Customer(int custId, String custName, Gender gender, double premium, int payMode) {
        this.custId = custId;
        this.custName = custName;
        this.gender = gender;
        this.premium = premium;
        this.payMode = payMode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", gender=" + gender +
                ", premium=" + premium +
                ", payMode=" + payMode +
                '}';
    }
}
