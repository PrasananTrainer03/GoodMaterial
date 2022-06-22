package com.java.abs;

abstract class Vehicle {
    public abstract void name();
    public abstract  void type();
}

class Enfield extends Vehicle {

    @Override
    public void name() {
        System.out.println("Name of Vehicle is Enfield Bullet...");
    }

    @Override
    public void type() {
        System.out.println("Its 2wheeler 500CC bike");
    }
}

class I20 extends Vehicle {

    @Override
    public void name() {
        System.out.println("Nme of Vehicle is I20...");
    }

    @Override
    public void type() {
        System.out.println("Its 4 wheeler 2000CC Car...");
    }
}
public class AbsTest {
    public static void main(String[] args) {
        Vehicle[] arr = new Vehicle[] {
          new I20(), new Enfield()
        };
        for(Vehicle v : arr) {
            v.name();
            v.type();
        }
    }
}
