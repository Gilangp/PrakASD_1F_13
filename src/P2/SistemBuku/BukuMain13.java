package P2.SistemBuku;

public class BukuMain13 {
    public static void main(String[] args) {
        int diskon, hargaBayar, totalHarga;

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

        Buku13 bk2 = new Buku13("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.tampilInformasi();
        totalHarga = bk2.hitungHargaTotal(6);
        diskon = bk2.hitungDiskon(totalHarga);
        hargaBayar = bk2.hitungHargaBayar(totalHarga);

        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + hargaBayar);


        Buku13 bkGilangPurnomo = new Buku13("Spiderman", "Gilang Purnomo", 100, 20, 50000);
        bkGilangPurnomo.tampilInformasi();
        totalHarga = bkGilangPurnomo.hitungHargaTotal(4);
        diskon = bkGilangPurnomo.hitungDiskon(totalHarga);
        hargaBayar = bkGilangPurnomo.hitungHargaBayar(totalHarga);

        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + hargaBayar);
    }
}
