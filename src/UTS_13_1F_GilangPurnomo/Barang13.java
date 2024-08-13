package UTS_13_1F_GilangPurnomo;

public class Barang13 {
    String kodeBarang;
    String nama;
    String kategori;
    int stok;
    int harga;


    public Barang13(String kodeBarang, String nama, String kategori, int stok, int harga) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
    }

    public void tampilDataBarang13 () {
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + nama);
        System.out.println("Kategori : " + kategori);
        System.out.println("Stok : " + stok);
        System.out.println("Harga : " + harga);
    }
}
