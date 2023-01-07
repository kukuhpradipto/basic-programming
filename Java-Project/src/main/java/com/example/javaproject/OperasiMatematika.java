package com.example.javaproject;

public class OperasiMatematika {
    public static void main(String[] args) {

    int a = 100;
    int b = 7;

        System.out.println(a + b);
        System.out.println(a -b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


    // Augmented Assignments = operasi/ perhitungan ke dirinya sendiri
        // a = a + 10       a += 10
        // a = a - 10       a -= 10
        // a = a * 10       a *= 10
        // a = a / 10       a /= 10
        // a = a % 10       a %= 10

    int c = 10;

    c += 10;
    System.out.println(c);

    c /=10;
    System.out.println(c);

    c *= 10;
    System.out.println(c);


    // Unary Operator == perhitungan yang berada di depan operator
    // ++        a = a + 1
    // --        a = a - 1
    // -         negatif
    // +         positf
    // !         Bolean kebalikan


        int d = 100;
        int e = -10;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!true);

    }
}
