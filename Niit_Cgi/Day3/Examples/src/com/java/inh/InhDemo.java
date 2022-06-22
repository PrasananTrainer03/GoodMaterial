package com.java.inh;

class First {
    public void show() {
        System.out.println("Show Method from Class First...");
    }
}

class Second extends First {
    public void display() {
        System.out.println("Display Method from Class Second...");
    }
}

public class InhDemo {
    public static void main(String[] args) {
        Second obj = new Second();
        obj.show();
        obj.display();
    }
}
