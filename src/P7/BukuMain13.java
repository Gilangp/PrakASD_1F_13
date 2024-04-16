package P7;

import java.util.Scanner;

public class BukuMain13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku13 data = new PencarianBuku13();
        int jumBuku = 5;

        System.out.println("---------------------");
        System.out.println("Masukkan data Buku : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("------------------");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t : ");
            int stock = s.nextInt();

            Buku13 m = new Buku13(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Data keseluruhan Buku");
        System.out.println("=========================");
        data.bubbleSort();
        data.tampil();

        // System.out.println("______________________________");
        // System.out.println("______________________________");
        // System.out.println("Pencarian Data : ");
        // System.out.println("Masukkan Kode Buku yang dicari : ");
        // System.out.print("Kode Buku : ");
        // String cari = s1.nextLine();
        // System.out.println("Menggunakan Sequential Search");
        // int posisi = data.FindSeqSearchString(cari);
        // data.Tampilposisi(cari, posisi);
        // data.TambahData(cari, posisi);

        // System.out.println("\n___________________________");
        // System.out.println("___________________________");
        // System.out.println("Menggunakan method FindBuku");
        // Buku13 dataBuku13 = data.FindBuku(cari);
        // dataBuku13.tampilDataBuku();

        // System.out.println("\n========================");
        // System.out.println("Menggunkan Binary Search");
        // posisi = data.FindBinarySearchString(cari, 0, jumBuku - 1);
        // data.Tampilposisi(cari, posisi);
        // data.TambahData(cari, posisi);

        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Judul Buku yang dicari : ");
        System.out.print("Judul Buku : ");
        String Judul = s1.nextLine();
        System.out.println("Menggunakan Sequential Search");
        int posisiSeq = data.FindSeqSearchJudul(Judul);
        if (posisiSeq != -1 ) {
            System.out.println("Data Ditemukan");
        } else {
            System.out.println("Buku dengan judul " + Judul + " Tidak Ditemukan");
        }

        System.out.println("\n========================");
        System.out.println("Menggunkan Binary Search");
        int posisiBin = data.FindBinarySearchJudul(Judul, 0, jumBuku - 1);
        if (posisiBin != -1) {
            System.out.println("Buku dengan judul " + Judul + " Ditemukan");
            data.listBk[posisiBin].tampilDataBuku();
        } else {
            System.out.println("Buku dengan judul " + Judul + " Tidak Ditemukan");
        }
    }
}
