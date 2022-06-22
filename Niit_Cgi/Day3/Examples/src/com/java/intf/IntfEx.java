package com.java.intf;

interface ITraining {
    void name();
    void email();
}

class Pooja implements  ITraining {

    @Override
    public void name() {
        System.out.println("Name is Pooja...");
    }

    @Override
    public void email() {
        System.out.println("Email is pooja@gmail.com");
    }
}

class Santosh implements  ITraining {

    @Override
    public void name() {
        System.out.println("Name is Santosh...");
    }

    @Override
    public void email() {
        System.out.println("Email is santosh@gmail.com");
    }
}

class Hemanth implements  ITraining {

    @Override
    public void name() {
        System.out.println("Name is Hemanth...");
    }

    @Override
    public void email() {
        System.out.println("Email is hemanth@gmail.com");
    }
}
public class IntfEx {
    public static void main(String[] args) {
        ITraining[] arr = new ITraining[] {
          new Hemanth(),
          new Pooja(),
          new Santosh()
        };

        System.out.println("Training Details are  ");
        for(ITraining i : arr) {
            i.name();
            i.email();
        }
    }
}
