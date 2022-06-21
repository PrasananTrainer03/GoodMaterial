package com.java.day2;

public class StrDemo1 {

    public void show() {
        String str="Hello ";
        String s2 = str.concat(" World");
        System.out.println(str);
        System.out.println(s2);
    }
    public static void main(String[] args) {
        StrDemo1 obj = new StrDemo1();
        obj.show();
    }
}
