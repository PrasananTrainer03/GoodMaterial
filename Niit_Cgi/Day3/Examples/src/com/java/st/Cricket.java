package com.java.st;

public class Cricket {

    static int score;

    public void increment(int x) {
        score+=x;
    }
    public static void main(String[] args) {
        Cricket fb = new Cricket();
        Cricket sb = new Cricket();
        Cricket ext = new Cricket();

        fb.increment(43);
        sb.increment(11);
        ext.increment(10);
        System.out.println("Total Score is   " +Cricket.score);
    }
}
