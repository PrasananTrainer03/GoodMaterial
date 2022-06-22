package com.java.st;

public class StaticDemo {
    static int count;
    public void increment() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();

        obj1.increment();
        obj2.increment();
        obj3.increment();
    }
}
