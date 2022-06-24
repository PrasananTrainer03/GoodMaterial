package com.java.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample2 {

    public void show(Date dt) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = sdf.format(dt);
        System.out.println(str);
    }
    public static void main(String[] args) {
        Date obj = new Date();
        DateExample2 dt = new DateExample2();
        dt.show(obj);
    }
}
