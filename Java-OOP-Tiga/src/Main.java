import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaKendaraan = input.nextLine();
        int tahun = input.nextInt();
        int kecepatan = input.nextInt();


        Kendaraan kendaraan = new Kendaraan(tahun, kecepatan, namaKendaraan);
        kendaraan.profil(tahun, kecepatan, namaKendaraan);

    }

}