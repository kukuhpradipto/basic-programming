public class Kendaraan {

    //buat preogram untuk menggenerate nama motor yang isinya nama kendaraa bahan bakar tahun pembuatan

    // kendaraan bisa berjalan sampai berapa
    // kendaraan isi bahan bakar dimana
    // kendaraan ampernya sampai berapa

    //Buatlah 3 object yang berbeda dan semua inputnya dari user

    String namaKendaraan, bahanBakar, tempatIsi;
    int tahunPembuatan, jarak, kapasitasKensdaraan;

    public Kendaraan (String namaKendaraan, String bahanBakar, String tempatIsi, int tahunPembuatan, int jarak, int kapasitasKensdaraan) {
        this.namaKendaraan = namaKendaraan;
        this.bahanBakar = bahanBakar;
        this.tempatIsi = tempatIsi;
        this.tahunPembuatan = tahunPembuatan;
        this.jarak = jarak;
        this.kapasitasKensdaraan = kapasitasKensdaraan;

    }

    public void berjalan(String namaKendaraan, String bahanBakar, int jarak){
        System.out.println(" Kendaraan bermerk " + this.namaKendaraan + " Bahan Bakar " + this.bahanBakar + " dapat berjalan dengan jarak " + this.jarak);
    }

    public void isiBahanBakar (String bahanBakar, String tempatIsi){
        System.out.println(" Kendaraan ini bahan bakarnya adalah " + this.bahanBakar + " dan langganan POM di " + this.tempatIsi);
    }

    public void kapasitasKensdaraan(String namaKendaraan, int kapasitasKensdaraan){
        System.out.println(" Kendaraan " + this.namaKendaraan + " memeliki " + this.kapasitasKensdaraan + " CC");
    }

}
