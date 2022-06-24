package com.java.ex;

import java.util.Scanner;

public class Voting {

    public void check(int age) throws VotingException {
        if (age < 18) {
            throw new VotingException("You are not elligible for voting...");
        } else {
            System.out.println("You are Elligible for Voting...");
        }
    }
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age   ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        Voting obj = new Voting();
        try {
            obj.check(age);
        } catch (VotingException e) {
            System.out.println(e.getMessage());
        }
    }
}
