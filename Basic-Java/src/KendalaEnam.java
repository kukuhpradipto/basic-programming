import java.util.Scanner;

public class KendalaEnam {
    private static int DrawXYZ(int height) {
        int k = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                k++;

                if(k % 3 == 0){
                    System.out.print(" X ");
                } else if (k % 2 == 1) {
                    System.out.print(" Y ");
                } else if (k % 2 == 0){
                    System.out.print(" Z ");
                }
            }
                System.out.println("");
        }
        return height;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nomornya : ");
        int height = input.nextInt();
        DrawXYZ(height);
    }
}
