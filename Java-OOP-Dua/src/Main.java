import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Silahkan masukan data nama kendaraan : ");
        String namaKendaraan = input.nextLine();

        System.out.print(" Silahkan masukan data jenis bahan bakar : ");
        String bahanBakar = input.nextLine();

        System.out.print(" Silahkan masukan data tempat mengisi bahan bakar : ");
        String tempatIsi = input.nextLine();

        System.out.print(" Silahkan masukan data tahun pembuatan sepeda motor : ");
        int tahunPembuatan = input.nextInt();

        System.out.print(" Silahkan masukan data jarak : ");
        int jarak = input.nextInt();

        System.out.print(" Silahkan masukan data CC kendaraan : ");
        int kapasitasKensdaraan = input.nextInt();

    //    String namaKendaraan, String bahanBakar, String tempatIsi, int tahunPembuatan, int jarak, int kapasitasKensdaraan

        Kendaraan kendaraan = new Kendaraan(namaKendaraan,bahanBakar, tempatIsi, tahunPembuatan, jarak, kapasitasKensdaraan);
        kendaraan.berjalan(namaKendaraan, bahanBakar, jarak);
        kendaraan.isiBahanBakar(bahanBakar, tempatIsi);
        kendaraan.kapasitasKensdaraan(namaKendaraan, kapasitasKensdaraan);
    }
}