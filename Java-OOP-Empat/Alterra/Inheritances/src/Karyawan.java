public class Karyawan {

    int gaji;
    int jumlahAbsen;

    public int hitungGajiSetahun(){
        int hasil = gaji * 12;
        return hasil;
    }

    public int getGaji(int gaji) {
        return gaji;
    }

    public int getJumlahAbsen( int jumlahAbsen) {
        return jumlahAbsen;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void setJumlahAbsen(int jumlahAbsen) {
        this.jumlahAbsen = jumlahAbsen;
    }
}
