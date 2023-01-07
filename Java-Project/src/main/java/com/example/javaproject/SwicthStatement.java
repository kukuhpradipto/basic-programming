package com.example.javaproject;

public class SwicthStatement {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Selemat anda lulus dengan Sangat Baik");
                break;
            case "B":
            case "C":
                System.out.println("Selamat anda lulus dengan baik");
                break;
            case "D":
                System.out.println("Sangat di sayangkan anda tidak lulus");
                break;
            default:
                System.out.println("Nilai anda tidak tercantum, silahkan konfirmasi dosen terkait");
        }

    }
}
