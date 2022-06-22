package com.java.abs;

class Basha extends Employ {

    public Basha(int empno, String name, double basic) {
        super(empno, name, basic);
    }
}

class Shaheed extends Employ {

    public Shaheed(int empno, String name, double basic) {
        super(empno, name, basic);
    }
}

class Vyshnavi extends Employ {

    public Vyshnavi(int empno, String name, double basic) {
        super(empno, name, basic);
    }
}

abstract class Employ {
    int empno;
    String name;
    double basic;

    @Override
    public String toString() {
        return "Employ{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", basic=" + basic +
                '}';
    }

    public Employ(int empno, String name, double basic) {
        this.empno = empno;
        this.name = name;
        this.basic = basic;
    }


}
public class AbsCon {

    public static void main(String[] args) {
        Employ[] arr = new Employ[] {
          new Vyshnavi(1, "Vyshnavi", 84234),
          new Shaheed(2, "Shaheed", 84244),
          new Basha(3, "Basha", 82512)
        };
        System.out.println("Employ List is  ");
        for(Employ e : arr) {
            System.out.println(e);
        }
    }
}
