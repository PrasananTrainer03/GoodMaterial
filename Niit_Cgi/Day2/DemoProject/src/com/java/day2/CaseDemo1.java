package com.java.day2;

public class CaseDemo1 {

    public void show(int choice) {
        switch(choice) {
            case 1 :
                System.out.println("Hi I am Rohit...");
                break;
            case 2 :
                System.out.println("Hi I am Pooja...");
                break;
            case 3 :
                System.out.println("Hi I am Hemanth...");
                break;
            case 4 :
                System.out.println("Hi I am Shiva...");
                break;
            case 5 :
                System.out.println("Hi I am Sheik...");
                break;
            default :
                System.out.println("Invalid Choice...");
                break;
        }
    }
    public static void main(String[] args) {
        int choice=6;
        CaseDemo1 obj = new CaseDemo1();
        obj.show(choice);
    }
}
