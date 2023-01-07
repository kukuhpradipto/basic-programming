public class Kendaraan {
    int tahun, kecepatan;
    String namaKendaraan;

    public Kendaraan (int tahun, int kecepatan, String namaKendaraan) {
        this.tahun = tahun;
        this.kecepatan = kecepatan;
        this.namaKendaraan = namaKendaraan;
    }

    public void profil (int tahun, int kecepatan, String namaKendaraan){
        System.out.println("Nama Kendaraan " + this.namaKendaraan +" Tahun Pembuatan "+ this.tahun+" maksimalkecepatan " + this.kecepatan);
    }
}
