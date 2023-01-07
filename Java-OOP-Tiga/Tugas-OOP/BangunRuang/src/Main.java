import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //KUBUS
        System.out.println("KUBUS");
        System.out.print("Silahkan masukan data Sisi Kubus : ");
        int sisi = input.nextInt();
        System.out.println();

        Kubus kubus = new Kubus(sisi);
        System.out.println("Volume Kubus adalah : " + kubus.volumeKubus(sisi));

        System.out.println();
        System.out.println("========================================================");
        System.out.println();


        // BALOK
        System.out.println("BALOK");
        System.out.print("Silahkan masukan panjang Balok : ");
        int panjang = input.nextInt();
        System.out.print("Silahkan masukan lebar Balok : ");
        int lebar = input.nextInt();
        System.out.print("Silahkan masukan tinggi Balok : ");
        int tinggi = input.nextInt();
        System.out.println();

        Balok balok = new Balok(panjang, lebar, tinggi);
        System.out.println("Volume Balok adalah : " + balok.volumeBalok(panjang,lebar,tinggi));

        System.out.println();
        System.out.println("========================================================");
        System.out.println();

        //TABUNG
        System.out.println("TABUNG");
        System.out.print("Silahkan masukan jari-jari Tabung : ");
        double jariJari = input.nextDouble();
        System.out.print("Silahkan masukan Tinggi Tabung : ");
        double tinggiTabung = input.nextDouble();

        Tabung tabung = new Tabung(jariJari, tinggiTabung);
        System.out.println("Volume Tabung adalah : " + tabung.volumeTabung(jariJari,tinggiTabung));

    }

}