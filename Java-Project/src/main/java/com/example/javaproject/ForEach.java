package com.example.javaproject;

public class ForEach {
    public static void main(String[] args) {

        // Tanpa menggunakan for each
        String[] array = {
                "Kukuh","Pradipto","Programmer","Quality","Assurance","Manual","Bismillah"
        };

        for (int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
        }

        // Menggunakan for each

        String[] array2 = {
                "Kukuh","Pradipto","Programmer","Quality","Assurance","Manual","Bismillah"
        };
        for (var value : array2){
            System.out.println(value);
        }

    }
}
