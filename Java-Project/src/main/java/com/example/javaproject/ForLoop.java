package com.example.javaproject;

public class ForLoop {
    public static void main(String[] args) {

        // Perulangan dengan kondisi
        var counter = 1;

        for(; counter <=10 ;){
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

        // Perulangan dengan init Statement
        for(var counter2 = 5; counter2 <= 10;){
            System.out.println("ke 2 Perulangan ke-" + counter2);
            counter2++;
        }

        // Perulangan dengan Post statement
        for(var counter3 = 2; counter3 <= 12; counter3++){
            System.out.println("ke-3 Perulangan Ke-" + counter3);
        }

    }
}
