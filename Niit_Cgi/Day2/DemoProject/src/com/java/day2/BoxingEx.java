package com.java.day2;

public class BoxingEx {

    public static void main(String[] args) {
        int a=12;
        String str="Hello";
        double basic=84823.43;

        /* Implement Boxing */
        Object ob1=a;
        Object ob2=str;
        Object ob3=basic;

        /* Implement Unboxing */
        int a1 = (Integer)ob1;
        String s1 = (String)ob2;
        double bas = (Double)ob3;
        System.out.println(a1);
        System.out.println(s1);
        System.out.println(bas);
    }
}
