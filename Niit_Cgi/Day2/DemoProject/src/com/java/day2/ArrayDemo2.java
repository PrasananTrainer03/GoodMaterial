package com.java.day2;

public class ArrayDemo2 {

    public void show() {
        String[] names = new String[] {
                "Irfan", "Ritishree","Shilpa","Sneha","Gopi","Vivek"
        };
        for(String s : names) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        ArrayDemo2 obj = new ArrayDemo2();
        obj.show();
    }
}
