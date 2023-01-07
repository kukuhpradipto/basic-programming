public class Tabung {

    double jariJari, tinggiTabung;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggiTabung = tinggiTabung;
    }

    public double volumeTabung(double jariJari, double tinggiTabung){
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggiTabung;
        return volume;
    }
}
