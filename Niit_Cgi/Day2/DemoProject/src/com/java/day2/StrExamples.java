package com.java.day2;

public class StrExamples {

    public void show() {
        String str = "Welcome to Java Programming...";
        System.out.println("Length of String is   " +str.length());
        System.out.println("First Occurrence of char 'o' is  " +str.indexOf("o"));
        System.out.println("Last Occurrence of Char 'o' is   " +str.lastIndexOf("o"));
        System.out.println("Char at 5th position   " +str.charAt(5));
        System.out.println("Lower Case String is  " +str.toLowerCase());
        System.out.println("Upper Case String is   " +str.toUpperCase());
        System.out.println("Replaced String is  " +str.replace("Java", "J2EE"));
        String s1="Hemanth", s2="Pooja",s3="Hemanth";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
    }
    public static void main(String[] args) {
        StrExamples obj = new StrExamples();
        obj.show();
    }
}
