package com.java.day2;

public class Employ {

    int empno;
    String name;
    double basic;

    @Override
    public String toString() {
        return "Employ Number  " +empno+ " Employ Name  " +name+ " Basic  " +basic;
    }

    public static void main(String[] args) {
        Employ e1 = new Employ();
        e1.empno=1;
        e1.name="Vikram";
        e1.basic=83824;

        Employ e2 = new Employ();
        e2.empno=3;
        e2.name="Vivek";
        e2.basic=88245;

        System.out.println(e1);
        System.out.println(e2);
    }
}
