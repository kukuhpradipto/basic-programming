package com.example.javaproject;

public class SwitchLambda {
    public static void main(String[] args) {
         var nilai = "C";

         switch (nilai) {
             case "A" -> System.out.println("Lulus dengan sangat memuaskan");
             case "B","C" -> System.out.println(" Anda Lulus");
             case "D" -> System.out.println("Anda tidak Lulus");
             default -> {
                 System.out.println("Nilai anda tidak ada");
             }
         }
    }
}
