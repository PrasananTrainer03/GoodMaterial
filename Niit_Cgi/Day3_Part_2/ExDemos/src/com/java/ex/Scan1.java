package com.java.ex;

import java.util.Scanner;

public class Scan1 {

    public static void main(String[] args) {
        String name;
        System.out.println("Enter Your Name   ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("name is  " +name);
    }
}
