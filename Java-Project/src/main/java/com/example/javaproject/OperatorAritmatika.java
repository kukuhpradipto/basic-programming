package com.example.javaproject;

public class OperatorAritmatika {
    public static void main(String[] args){
        // Operasi Aritmatika
        int a = 10;
        int b = 20;
        int c = 3;
        int hasil;

        // 1. penjumlahan
        hasil = a + b ;
        System.out.println("hasil penjumlahan " + a +" + " + b + " adalah " +hasil);

        // 2. Pengurangan
        hasil = a - c ;
        System.out.printf("hasil pengurangan %d - %d adalah %d \n",a,c,hasil );

        // 3. Perkalian
        hasil = c * a ;
        System.out.printf("hasil perkalian %d x %d adalah %d \n",c,a,hasil );

        // 4. Pembagian
        hasil = b / c ;
        System.out.printf("hasil pembagian %d / %d adalah %d \n",b,c,hasil );

        float d = 10;
        float e = 7;
        float hasilFloat = d/e;
        System.out.println("hasil pembagian menggunakan data float"+hasilFloat);

        // 5. Modulus (sisa pembagian)
        hasil = b % c ;
        System.out.printf("hasil modulus %d %% %d adalah %d \n",b,c,hasil );
    }


}
