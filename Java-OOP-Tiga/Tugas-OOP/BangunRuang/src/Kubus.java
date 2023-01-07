public class Kubus {

    double sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public double volumeKubus (int sisi){
        double volume = Math.pow(sisi,3);
        return volume;
    }
}
