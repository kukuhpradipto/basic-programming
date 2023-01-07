package com.example.javaproject;

public class KonversiTipeData {

    public static void main(String[] args){
// byte < short < int < long

//        Konversi tipe Data
        int nilaiInt = 450; // 32 bit
        System.out.println("nilai integer " +nilaiInt);

//        Konversi ke data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long adalah " + nilaiLong);

//        Memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt; // dapat mengubah nilai aslinya
        System.out.println("nilai byte " + nilaiByte);
        System.out.println("nilai maksimum byte " + Byte.MAX_VALUE);

//        Casting pembagian
        int a = 33;
        int b = 7;
        float hasil = (float) a/b;
        System.out.printf("hasilnya pembagiannya adalah = %f", hasil);



    }
}
