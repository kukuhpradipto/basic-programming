package com.example.javaproject;

public class OperasiArray {
    public static void main(String[] args) {
        // Operasi Array
        // array[index]             = mengambil data
        // array[index] = value     = merubah data
        // array.lenght             = mengambil panjang array


        long[] arrayLong = {
                1,2,3,4,5,6,7,8,9
        };

        arrayLong[0] = 100;
        arrayLong[3] = 0;
        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[3]);
        System.out.println(arrayLong.length);



        //Array didalam Array

        String[][] members = {
                {"singa", "buaya", "kucing"},
                {"mangga","durian","nanas"},
                {"kaya","miskin","cukup"}
        };


        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][2]);




    }
}
