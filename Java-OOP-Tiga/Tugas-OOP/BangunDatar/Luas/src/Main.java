import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //PERSERGI
        System.out.println("PERSERGI");
        System.out.print("Masukan panjang sisi Persegi : ");
        int sisiPersegi = input.nextInt();

        Persegi persegi = new Persegi(sisiPersegi);
        System.out.println();
        System.out.println("Nilai Luasnya adalah : " + persegi.luasPersegi(sisiPersegi));
        System.out.println();
        System.out.println("=====================================================================");
        System.out.println();

        //PERSEGI PANJANG
        System.out.println("PERSEGI PANJANG");
        System.out.print("Masukan nilai panjang Persegi Panjang: " );
        int panjang = input.nextInt();
        System.out.print("Masukan nilai lebar Persegi Panjang: ");
        int lebar = input.nextInt();

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        System.out.println();
        System.out.println("Nilai Luas Persegi Panjang Adalah : " + persegiPanjang.luasPersegiPanjang(panjang,lebar));
        System.out.println();
        System.out.println("=====================================================================");
        System.out.println();

        // SEGITIGA
        System.out.println("SEGITIGA");
        System.out.print("Silahkan masukan nilai alas Segitiga : ");
        double alas = input.nextDouble();
        System.out.print("Silahkan masukan nilai tinggi Segitiga : ");
        double tinggi = input.nextDouble();


        Segitiga segitiga = new Segitiga(alas, tinggi);
        System.out.println();
        System.out.println(" Nilai Luas Segitiga adalah : " + segitiga.luasSegitiga(alas,tinggi));
    }

}
