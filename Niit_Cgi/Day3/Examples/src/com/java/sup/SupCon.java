package com.java.sup;

class Pooja extends Employ {

    public Pooja(int empno, String name, double basic) {
        super(empno, name, basic);
    }
}

class Vikram extends Employ {

    public Vikram(int empno, String name, double basic) {
        super(empno, name, basic);
    }
}

class Hemanth extends Employ {

    public Hemanth(int empno, String name, double basic) {
        super(empno, name, basic);
    }
}
class Employ {
    int empno;
    String name;
    double basic;

    public Employ(int empno, String name, double basic) {
        this.empno = empno;
        this.name = name;
        this.basic = basic;
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
public class SupCon {
    public static void main(String[] args) {
        Employ[] arr = new Employ[]
         {
            new Hemanth(1, "Hemanth", 98423),
            new Vikram(2, "Vikram", 842442),
            new Pooja(3, "Pooja", 84253)
         };

        for(Employ e : arr) {
            System.out.println(e);
        }
    }
}
