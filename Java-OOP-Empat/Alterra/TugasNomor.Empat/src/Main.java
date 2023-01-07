import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PriceCount priceCount = new PriceCount();

        System.out.println("SIlahkan masukan data : ");
        System.out.print("Data Panjang : ");
        int p = input.nextInt();
        System.out.print("Data Lebar : ");
        int l = input.nextInt();
        System.out.print("Data TInggi : ");
        int t = input.nextInt();

        System.out.print("Data Berat : ");
        float berat = input.nextFloat();
        System.out.println();


        System.out.println("Dimensi berat : " + priceCount.dimentionCount (p,l,t));
        System.out.println("Harga Pengiriman : " + priceCount.calculateWeight(berat));



    }
}