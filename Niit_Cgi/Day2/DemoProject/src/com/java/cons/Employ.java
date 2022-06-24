package com.java.cons;

public class Employ {
    int empno;
    String name;
    double basic;

    public Employ(int empno, String name, double basic) {
        this.empno = empno;
        this.name = name;
        this.basic = basic;
    }

    public Employ() {
        this.empno=1;
        this.name="Sravanthi";
        this.basic=93244;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", basic=" + basic +
                '}';
    }
}
