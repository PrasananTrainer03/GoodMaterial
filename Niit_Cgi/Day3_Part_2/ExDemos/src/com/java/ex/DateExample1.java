package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample1 {

    public void show(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = sdf.parse(str);
        System.out.println(dt);
    }
    public static void main(String[] args) {
       String str = "2022-06-22";
       DateExample1 obj = new DateExample1();
        try {
            obj.show(str);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
