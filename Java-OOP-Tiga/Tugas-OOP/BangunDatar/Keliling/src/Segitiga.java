public class Segitiga {

    double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double kelilingSegitiga(double alas, double tinggi){
//        double alasPangkat = Math.pow(alas, 2);
//        double tinggiPangkat = Math.pow(tinggi,2);
//        double sisiAkar =  alasPangkat + tinggiPangkat;
        double sisiAkarHasil = Math.sqrt( Math.pow(alas, 2) + Math.pow(tinggi,2));

        double keliling = (2* sisiAkarHasil) + alas;
        return keliling;
    }
}
