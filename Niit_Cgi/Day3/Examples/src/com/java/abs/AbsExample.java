package com.java.abs;

abstract class Training {
    abstract void name();
    abstract void email();
}

class Sudharshan extends Training {

    @Override
    void name() {
        System.out.println("Hi I am Sudharshan...");
    }

    @Override
    void email() {
        System.out.println("Email is sudharshan@gmail.com");
    }
}

class Saurabh extends Training {

    @Override
    void name() {
        System.out.println("Hi I am Saurabh...");
    }

    @Override
    void email() {
        System.out.println("Email is saurabh@gmail.com");
    }
}

class Sreelatha extends Training {

    @Override
    void name() {
        System.out.println("Name is Sreelatha...");
    }

    @Override
    void email() {
        System.out.println("Email is sreelatha@gmail.com");
    }
}
public class AbsExample {
    public static void main(String[] args) {
        Training[] arr = new Training[] {
          new Sreelatha(),
          new Saurabh(),
          new Sudharshan()
        };

        for(Training t : arr) {
            t.name();
            t.email();
        }
    }
}
