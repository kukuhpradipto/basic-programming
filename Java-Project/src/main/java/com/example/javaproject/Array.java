package com.example.javaproject;

public class Array {
    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Satu";
        arrayString[1] = "dua";
        arrayString[2] = "tiga";

        String[] stringArray2 = new String[3];

        // System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "tegar";
        System.out.println(arrayString[0]);


        // Array Initializer
        int[] arrayInt = new int[]{
                10,90,80,67,29
        };

        long[] arrayLong = {

                10,90,76,89,91,22
        };

    }
}
