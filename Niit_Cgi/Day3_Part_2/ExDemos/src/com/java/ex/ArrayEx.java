package com.java.ex;

public class ArrayEx {

    public static void main(String[] args) {
        try {
            int[] a = new int[]{23,52};
            a[10]=83;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Size is Small...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
