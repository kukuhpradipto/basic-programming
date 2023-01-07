public class PersegiPanjang {

    int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int kelilingPanjang (int panjang, int lebar){
        int keliling = 2 * ( panjang + lebar);
        return keliling;
    }
}
