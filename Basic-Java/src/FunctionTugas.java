import javax.xml.namespace.QName;
import java.util.Scanner;

public class FunctionTugas {
    // Function void untuk menampilkan nama dan kelas
    // function hitung luas persegi panjang,
    // luas persegi dan keliling persegi panjang

    private static void profil(String name, String kelas) {
        System.out.println("Nama " + name + " dan kelas " + kelas);}

    private static int luasPersegiPanjang (int panjang, int lebar){
        int luasPersegiPanjang;
        luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
    }

    private static int luasPersegi(int sisi){
        int luasPersegi;
        luasPersegi = sisi*sisi;
        return luasPersegi;
    }

    private static int kelilingPersegiPanjang(int panjangg, int lebarr){
        int kelilingPersegiPanjang;
        kelilingPersegiPanjang = 2 * (panjangg + lebarr);
        return kelilingPersegiPanjang;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama Kamu : ");
        String name = input.nextLine();
        System.out.println("Masukan Kelas Kamu : ");
        String kelas = input.nextLine();
        profil(name,kelas);

        System.out.println("Masukan Panjang : ");
        int panjang = input.nextInt();
        System.out.println("Masukan Lebar : ");
        int lebar = input.nextInt();
        System.out.println("Hasil luas persegi pajang " + luasPersegiPanjang(panjang,lebar));


        System.out.println("Masukan Sisi : ");
        int sisi = input.nextInt();
        System.out.println("Hasil luas persegi " + luasPersegi(sisi));


        System.out.println("Masukan Panjang untuk Keliling: ");
        int panjangg = input.nextInt();
        System.out.println("Masukan Lebar untuk Keliling: ");
        int lebarr = input.nextInt();
        System.out.println( "Hasil keliling Persegi Panjang " + kelilingPersegiPanjang(panjangg,lebarr));

    }
}
