import java.util.Scanner;

public class KaryawanMain {

    public static void main(String[] args) {
        QaulityEngineer riskiFerdian = new QaulityEngineer(1000, 3);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Gaji : ");
        int gaji = input.nextInt();
//        riskiFerdian.setGaji(gaji);
        riskiFerdian.setJumlahAbsen(10);
        System.out.println("Gaji " + riskiFerdian.hitungGajiSetahun());
        System.out.println("Bonus " + riskiFerdian.hitungGajiTambahBonus());
    }
}
