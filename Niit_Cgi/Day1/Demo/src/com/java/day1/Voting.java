package com.java.day1;

public class Voting {

    public void check(int age) {
        if (age >= 18) {
            System.out.println("You are elligible for voting...");
        } else {
            System.out.println("You are not elligible for voting...");
        }
    }
    public static void main(String[] args) {
        int age=19;
        Voting obj = new Voting();
        obj.check(age);
    }
}
