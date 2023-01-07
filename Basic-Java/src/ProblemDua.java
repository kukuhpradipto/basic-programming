import java.util.Scanner;

public class ProblemDua {
        public static void main(String[] args) {

            // REFERENCE DATA INPUT
            // A  80 - 100
            // B+ 65 - 79
            // B  50 - 64
            // C  49 - 35
            // D  0 - 35
            // Selain itu Data invalid

            // INPUT DATA
            Scanner input = new Scanner(System.in);
            System.out.print("Silahkan masukan nilai Kamu !. : ");
            int nilai = input.nextInt();


            // PROCESS
            if (nilai >= 80 && nilai <= 100) {

                // OUTPUT
                System.out.println("Your predicate is A");
            } else if (nilai >= 65 && nilai <= 79) {
                System.out.println("Your predicate is B");
            } else if (nilai >= 50 && nilai <= 64) {
                System.out.println("Your predicate is B+");
            } else if (nilai >= 35 && nilai <= 49) {
                System.out.println("Your predicate is C");
            } else if (nilai >= 0 && nilai <= 34) {
                System.out.println("Your predicate is D");
            } else {
                System.out.println("Your data is not valite");
            }
        }
}
