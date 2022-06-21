package com.java.cons;

public class Conover {

    int a, b;

    public Conover() {
        this.a=53;
        this.b=42;
    }

    public Conover(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Conover{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        Conover obj1 = new Conover();
        System.out.println(obj1);
    }
}
