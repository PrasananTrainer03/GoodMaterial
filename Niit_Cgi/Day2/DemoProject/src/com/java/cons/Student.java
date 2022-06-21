package com.java.cons;

public class Student {
    int sno;
    String name;
    String city;
    double cgp;

    Student() {
        this.sno=1;
        this.name="Snehit";
        this.city="Chennai";
        this.cgp=8.6;
    }

    public Student(int sno, String name, String city, double cgp) {
        this.sno = sno;
        this.name = name;
        this.city = city;
        this.cgp = cgp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", cgp=" + cgp +
                '}';
    }
}
