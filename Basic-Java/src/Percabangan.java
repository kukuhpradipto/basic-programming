import java.sql.SQLOutput;
import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int panjang = input.nextInt();
//        int lebar = input.nextInt();
//
//        System.out.println("Panjang = " + panjang);
//        System.out.println("Lebar = " + lebar);
//
//        int luas = lebar*panjang;
//        System.out.println("Hasil luas = "+ luas);

        System.out.println(" alas = ");
        float alas = input.nextFloat();

        System.out.println(" tinggi = ");
        float tinggi = input.nextFloat();

        System.out.println("Alas  = " + alas);
        System.out.println("Tinggi = " + tinggi);

        float luasSegitiga = alas*tinggi/2;
        System.out.println("Luas Segitiganya Adalah " + luasSegitiga);

    }
}
