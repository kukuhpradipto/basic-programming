public class Unggas {

    String tipeUnggas;
    int umur;

    // makan minumn berburu


    public Unggas(String tipeUnggas, int umur) {
        this.tipeUnggas = tipeUnggas;
        this.umur = umur;
    }

    public void unggas(String tip){
        System.out.println(this.tipeUnggas + "merupakan tipe unggas");
    }
}
