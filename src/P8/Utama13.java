package P8;

import java.util.Scanner;;

public class Utama13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah kapasitas Gudang: ");
        int jumKapasitas = input.nextInt();

        Gudang13 gudang = new Gudang13(jumKapasitas);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampil tumpukan barang");
            System.out.println("4. Melihat barang teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = input.nextLine();
                    Barang13 barangBaru = new Barang13(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5: 
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
