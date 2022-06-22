package com.java.sup;

class First {
    public void show() {
        System.out.println("Show Method from Class First...");
    }
}

class Second extends First {
    public void show() {
        super.show();
        System.out.println("Show Method from Class Second...");
    }
}

public class SupEx {
    public static void main(String[] args) {
        Second obj = new Second();
        obj.show();
    }
}
