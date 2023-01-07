package com.example.javaproject;

public class ElseIf {
    public static void main(String[] args) {

        var nilai = 30;
        var absen = 75;

        if(nilai >=80 && absen >= 80){
            System.out.println("Nilai kamu A");
        } else if (nilai >= 75 && absen >= 75) {
            System.out.println("Nilai kamu B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai kamu C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai kamu D");
        } else  {
            System.out.println("Nilai kamu E");
        }
    }
}
