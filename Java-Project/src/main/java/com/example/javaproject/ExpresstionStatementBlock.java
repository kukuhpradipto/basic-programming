package com.example.javaproject;

import java.util.Date;

public class ExpresstionStatementBlock {
    public static void main(String[] args) {


        // Expression => single value
        int value;
        value = 10;

        System.out.println(value =100);

        // Statement >> berisi eksekusi komplit dan diahiri oleh titik koma
        // 1. Assignment expression
        // 2. Penggunaan ++ dan --
        // 3. Method invacation
        // 4. Object creation expression

        int value2;
        value2 = 10;

        System.out.println(value2 = 25);

        // Assignment Statement
        double aValue = 8933.234;
        // Icreament Stetement
        aValue++;
        // Method invocation statement
        System.out.println("Hallo World !");
        // Object Create statement
        Date date = new Date();


        // Block >> kumpulan statement kebih dari 0 statement diawali dan di akhiri {}

    }
}
