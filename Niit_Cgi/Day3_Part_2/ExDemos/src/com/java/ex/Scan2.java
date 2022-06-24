package com.java.ex;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter 2 Numbers  ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum is   " +c);
    }
}
