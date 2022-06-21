package com.java.cons;

public class EmpArray {

    public static void main(String[] args) {
        Emp[] arrEmp = new Emp[] {
                new Emp(1, "Vedanth","Java","Programmer",88234),
                new Emp(2, "Ritishree","Dotnet","Manager",89234),
                new Emp(3, "Rohit","Sql","Developer",99843),
                new Emp(4, "Irfan Basha","Java","Programmer",87744),
                new Emp(5, "ShivaKundan","Sql","Manager",90433),
        };

        for (Emp e:arrEmp) {
            System.out.println(e);
        }
    }
}
