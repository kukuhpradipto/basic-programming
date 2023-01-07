package com.example.javaproject;

public class SwitchTanpaYield {
    public static void main(String[] args) {
        var nilai = "D";
        String ucapan;

        switch (nilai){
            case "A" -> ucapan = " Lulus dengan sangat Baik";
            case  "B", "C" -> ucapan = "Lulus dengan baik";
            case  "D" -> ucapan = " Tidak Lulus";
            default -> ucapan = "Nilai anda tidak ada";
        }

        System.out.println(ucapan);


        // Menggunakan Yield

        var nilai2 = "A";

        String kalimat = switch (nilai2){
            case "A":
                yield "Lulus dengan sangt Baik";
            case "B","C":
                yield "Anda Lulus";
            case "D":
                yield "Anda tidak Lulus";
            default:
                yield "Nilai anda Kosong";
        };

        System.out.println(kalimat);
    }
}
