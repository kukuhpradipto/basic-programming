package com.example.javaproject;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        // Byte
        // Short
        // Integer
        // Long
        // Float
        // Double
        // Character
        //Boolean

        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;

        Short iniShort;
        iniShort = 100;

        System.out.println(iniShort);


        // Konservasi dari tipe primitif ke bukan primitif

        int age = 30;

        Integer ageObject = age;

        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();



    }
}
