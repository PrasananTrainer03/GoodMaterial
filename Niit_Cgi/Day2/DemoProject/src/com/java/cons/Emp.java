package com.java.cons;

public class Emp {

    int empno;
    String name;
    String dept;
    String desig;
    double basic;

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", desig='" + desig + '\'' +
                ", basic=" + basic +
                '}';
    }

    public Emp(){ }

    public Emp(int empno, String name, String dept, String desig, double basic) {
        this.empno = empno;
        this.name = name;
        this.dept = dept;
        this.desig = desig;
        this.basic = basic;
    }
}
