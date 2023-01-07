public class Segitiga {

    double alas, tinggi;
//    double sisi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
//        this.sisi = sisi;
    }

    public double luasSegitiga (double alas, double tinggi){
        double luas = ( alas * tinggi ) / 2;
        return luas;
    }
}
