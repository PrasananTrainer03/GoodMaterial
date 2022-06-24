package com.java.ex;

import java.util.Scanner;

public class Calculation {

    public void calc(int a, int b) throws NegativeException, NumberZeroException {
        if (a < 0 || b < 0) {
            throw new NegativeException("Negative Numbers Not Allowed...");
        } else if (a == 0 || b == 0) {
            throw new NumberZeroException("Zero is Invalid Value...");
        } else {
            int c = a + b;
            System.out.println("Sum is   " +c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 Numbers   ");
        a=sc.nextInt();
        b=sc.nextInt();
        Calculation obj = new Calculation();
        try {
            obj.calc(a, b);
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        } catch (NumberZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
