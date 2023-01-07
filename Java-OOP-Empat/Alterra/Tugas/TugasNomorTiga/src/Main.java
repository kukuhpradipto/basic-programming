import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operasion operasion = new Operasion();

        // PENJUMLAHAN
        System.out.println("PENJUMLAHAN");
        System.out.print("Masukan angka : ");
        int a = input.nextInt();
        System.out.print("Masukan angka : ");
        int b = input.nextInt();
        System.out.println("Hasil Penjumlahan " + operasion.Penjumlahan(a,b));
        System.out.println();

        //PENGURANGAN
        System.out.println("PENGURANGAN");
        System.out.print("Masukan angka : ");
        int c = input.nextInt();
        System.out.print("Masukan angka : ");
        int d = input.nextInt();

        System.out.println();
        System.out.println("Hasil Pengurangan " + operasion.Pengurangan(c,d));
        System.out.println();

        //PERKALIAN
        System.out.println("PERKALIAN");
        System.out.print("Masukan angka : ");
        int e = input.nextInt();
        System.out.print("Masukan angka : ");
        int f = input.nextInt();

        System.out.println();
        System.out.println("Hasil Perkalian " + operasion.Perkalian(e,f));
        System.out.println();

        //PENBAGIAN
        System.out.println("PENBAGIAN");
        System.out.print("Masukan angka : ");
        int g = input.nextInt();
        System.out.print("Masukan angka : ");
        int h = input.nextInt();

        System.out.println();
        System.out.println("Hasil Pembagian " + operasion.Pembagian(g,h));

    }
}