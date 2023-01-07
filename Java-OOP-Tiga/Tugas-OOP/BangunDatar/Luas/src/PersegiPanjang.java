public class PersegiPanjang {

    int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luasPersegiPanjang (int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }
}
