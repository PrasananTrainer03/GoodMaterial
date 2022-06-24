package com.java.intf;

interface IOne {
    void name();
}

interface ITwo {
    void email();
}

class Demo implements  IOne, ITwo {

    @Override
    public void name() {
        System.out.println("Name is CGI");
    }

    @Override
    public void email() {
        System.out.println("Email is cgi@gmail.com");
    }
}
public class MultiInh {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.name();
        obj.email();
    }
}
