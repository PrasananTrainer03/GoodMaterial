package com.java.cons;

public class SbExample {

    public void show() {
        StringBuilder sb = new StringBuilder("Welcome to Java Programming...");
        System.out.println(sb);
        sb.append("\r\n This is the New content we have in this...");
        System.out.println(sb);
        sb.delete(10, 20);
        System.out.println(sb);
    }
    public static void main(String[] args) {
        SbExample obj = new SbExample();
        obj.show();
    }
}
