package com.java.day2;

public class BoxTest {

    public void show(Object ob) {
        String str = ob.getClass().getSimpleName();
        System.out.println(str);
        if (str.equals("Integer")) {
            int x = (Integer)ob;
            System.out.println("Integer Casting..." +x);
        }
        if (str.equals("String")) {
            String x = (String)ob;
            System.out.println("String Casting..." +x);
        }
        if (str.equals("Double")) {
            double x = (Double)ob;
            System.out.println("Double Casting..." +x);
        }
    }
    public static void main(String[] args) {
        int a=12;
        String str="Cgi";
        double bas=84234.32;
        BoxTest obj = new BoxTest();
        obj.show(a);
        obj.show(str);
        obj.show(bas);
    }
}
