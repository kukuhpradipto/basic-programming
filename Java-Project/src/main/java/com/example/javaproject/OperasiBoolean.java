package com.example.javaproject;

public class OperasiBoolean {
    public static void main(String[] args) {

        // Operasi Boolean
        // &&       Dan
        // ||       Atau
        // !        Kebalian


        // Operasi &&
        // Nilai 1          Operator        Nilai 2         hasil
        // true             &&              true            True
        // true             &&              flase           False
        // False            &&              true            False
        // False            &&              false           False

        // Operasi ||
        // Nilai 1          Operator        Nilai 2         hasil
        // true             ||              true            True
        // true             ||              false           True
        // false            ||              true            True
        // false            ||              false           False

        // Operasi !
        // Operator         Nilai 2         Hasil
        // !                true            False
        // !                false           True

        var absen = 75;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;

        System.out.println(lulus);

    }
}
