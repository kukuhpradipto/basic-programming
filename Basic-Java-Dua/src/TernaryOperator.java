package com.example.javaproject;

public class TernaryOperator {
    public static void main(String[] args) {

        //Tanpa Ternary Operator
        var nilai = 65;
        String ucapan;

        if(nilai >= 70){
            ucapan = "Anda Lulus";
        } else {
            ucapan = "Anda Tidak Lulus";
        }

        System.out.println(ucapan);

        //Menggunakan Ternary Operator

        var nilai2 = 50;

        String kalimat = nilai2 >= 75 ? "Selamat Kamu Lulus" : "Maaf, Kamu Tidak Lulus";

        System.out.println(kalimat);

    }
}
