import java.util.Scanner;

public class ProblemSatu {

        public static void main(String[] args) {
            // DATA INPUT
            Scanner input = new Scanner(System.in);
            System.out.print("Alas = ");
            float alas = input.nextFloat();

            System.out.print("Tinggi = ");
            float tinggi = input.nextFloat();

            // PROCESS
            float luasSegitiga = alas*tinggi/2;

            // OUTPUT
            System.out.println("Luas Segitiganya Adalah " + luasSegitiga);

        }
    }



