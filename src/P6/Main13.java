package P6;

public class Main13 {
    public static void main(String[] args) {
        DaftarBuku13 listBuku = new DaftarBuku13();
        Buku13 m = new Buku13(20215, "Algoritma", 2019, "Wahyuni", 5);
        Buku13 m1 = new Buku13(20214, "Big Data", 2020, "Susilo", 3);
        Buku13 m2 = new Buku13(20212, "Desain UI", 2021, "Supriadi", 6);
        Buku13 m3 = new Buku13(20211, "Web Pemrograman", 2023, "Pustaka Adi", 2);
        Buku13 m4 = new Buku13(20211, "Etika Mahasiswa", 2023, "Darmawan", 1);

        listBuku.tambah(m);
        listBuku.tambah(m1);
        listBuku.tambah(m2);
        listBuku.tambah(m3);
        listBuku.tambah(m4);

        System.out.println("***********************");
        System.out.println("Data sebelum diturunkan");
        listBuku.tampil();

        System.out.println("****************************************************");
        System.out.println("Data setelah diturunkan secara Asc berdasarkan stock");
        listBuku.bubbleSort();
        listBuku.tampil();
    }
}
