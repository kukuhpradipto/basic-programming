import java.util.Scanner;

public class ProblemTiga {
    public static void main(String[] args) {

        // INPUT DATA
        Scanner input= new Scanner(System.in);
        System.out.print("Silahkan masukan yang nilai : ");
        int nilai = input.nextInt();

        // PROCESS
        System.out.println("Faktor dari angka " + nilai + " adalah =");
        for (int i = 1;i <= nilai; i++){
            if (nilai%i == 0) {

                // OUTPUT
                System.out.println(i);
            }
        }
    }
}
