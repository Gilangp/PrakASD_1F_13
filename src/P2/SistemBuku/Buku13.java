package P2.SistemBuku;

public class Buku13 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    public Buku13() {

    }

    public Buku13(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void terjual(int jml) {
        if (stok > 0 && stok >= jml) {
            stok -= jml;
        } else {
            System.out.println("Stok sudah habis");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int terjual) {
        return harga * terjual;
    }

    int hitungDiskon(int totalHarga) {
        if (totalHarga > 150000 ) {
            return (totalHarga * 12/100); // diskon 12%
        } else if (totalHarga >= 75000 && totalHarga <= 150000 ) {
            return (totalHarga * 5/100); // diskon 5%
        } else {
            return 0;
        }
    }

    int hitungHargaBayar(int totalHarga) {
        return totalHarga - hitungDiskon(totalHarga);
    }
}
