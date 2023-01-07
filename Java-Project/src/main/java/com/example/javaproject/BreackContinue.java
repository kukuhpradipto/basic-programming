package com.example.javaproject;

public class BreackContinue {
    public static void main(String[] args) {


        //Break
        var counter = 1;
        while (true){
            System.out.println("perulangan ke-" + counter);
            counter++;

            if(counter > 10){
                break;
            }
        }
        System.out.println("BERHENTI !!!");

        // Continue
        for(int counter2 = 1; counter2 <= 100; counter2++){
            if(counter2 % 2 == 0){
                continue;
            }
            System.out.println("Angka ganjil -" + counter2);
        }


    }
}
