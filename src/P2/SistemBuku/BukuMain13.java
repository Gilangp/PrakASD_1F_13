package P2.SistemBuku;

public class BukuMain13 {
    public static void main(String[] args) {
        Buku13 bk1 = new Buku13();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        // Buku13 bk2 = new Buku13();
        // bk2.judul = "How to Train Your Dragon";
        // bk2.pengarang = "Cressida Cowell";
        // bk2.halaman = 432;
        // bk2.stok = 0;
        // bk2.harga = 275000;

        // bk2.tampilInformasi();
        // bk2.terjual(4);

        Buku13 bk2 = new Buku13("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku13 bkGilangPurnomo = new Buku13("Spiderman", "Gilang Purnomo", 100, 20, 50000);
        bkGilangPurnomo.terjual(8);
        bkGilangPurnomo.tampilInformasi();
    }
}
