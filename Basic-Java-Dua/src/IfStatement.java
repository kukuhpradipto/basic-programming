package com.example.javaproject;

public class IfStatement {
    public static void main(String[] args) {

        var nilai = 78;
        var absen = 80;

        if(nilai >= 74 && absen >= 78){
            System.out.println("Anda Lulus");
        }         else {
            System.out.println("Maaf, Anda belum Lulus");
        }

    }
}
