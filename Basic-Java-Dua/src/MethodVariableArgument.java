
public class MethodVariableArgument {
    public static void main(String[] args) {


        // Tanpa Variable Argument

        int[] values = {90,30,79,66};
        sayCongcrats("kukuh",values );

        // Menggunakan Variable Argument

        sayCongcrats2("Alvi", 90,80,55,30,60,77,90);


    }
    // Tanpa Variable Argument

    static void sayCongcrats(String name, int[] values) {
        int total = 0;

        for(var value : values){
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + " Anda Lulus");
        } else {
            System.out.println("Maaf, " + name + " Tidak Lulus");
        }
    }

    // Menggunakan Variable Argument

    static void sayCongcrats2 (String name2, int... values2){
        int total2 = 0;

        for(var value2 : values2){
            total2+=value2;
        }

        int finalValue2 = total2 / values2.length;
        if(finalValue2 >= 75){
            System.out.println("Selamat " + name2 + ", Kamu Lulus !");
        } else {
            System.out.println("Sangat disayangkan " + name2 + ", Kamu tidak Lulus" );
        }
    }

    }


