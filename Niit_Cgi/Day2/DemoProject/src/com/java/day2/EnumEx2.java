package com.java.day2;

public class EnumEx2 {

    public static void main(String[] args) {
        String str="FRIDAY";
        WeekDays wd1 = WeekDays.valueOf(str);
        System.out.println(wd1);
    }
}
