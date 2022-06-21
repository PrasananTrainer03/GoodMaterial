package com.java.day2;

public class Student {
    int sno;
    String sname;
    String city;
    double cgp;

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", city='" + city + '\'' +
                ", cgp=" + cgp +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.sno=1;
        s1.sname="Gopi Shankar";
        s1.city="Chennai";
        s1.cgp=8.5;

        Student s2 = new Student();
        s2.sno=3;
        s2.sname="Vivek";
        s2.city="Hydeabad";
        s2.cgp=88245;

        System.out.println(s1);
        System.out.println(s2);
    }
}
