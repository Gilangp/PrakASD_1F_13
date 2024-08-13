package UAS_13_1F_GilangPurnomo;

import java.util.Scanner;

public class Main13 {
    public static void menu() {
        System.out.println("---------------------");
        System.out.println("Menu");
        System.out.println("---------------------");
        System.out.println("1. Daftar Kendaraan");
        System.out.println("2. Peminjaman");
        System.out.println("3. Tampilkan seluruh transaksi");
        System.out.println("4. Urutkan Transaksi urut no TNKB");
        System.out.println("5. Exit");
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DLLRental13 daftarRental = new DLLRental13();
        DLLTransaksi13 daftarTransaksi = new DLLTransaksi13();

        BarangRental13 kendaraan1 = new BarangRental13("S 4567 YV", "Honda Beat", "Motor", 2017, 10000);
        BarangRental13 kendaraan2 = new BarangRental13("N 4511 VS", "Honda Vario", "Motor", 2018, 10000);
        BarangRental13 kendaraan3 = new BarangRental13("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000);
        BarangRental13 kendaraan4 = new BarangRental13("AB 4321 A", "Toyota Inova", "Mobil", 2019, 60000);
        BarangRental13 kendaraan5 = new BarangRental13("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000);

        while (true) {
            menu();
            System.out.print("Pilih: ");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    daftarRental.add13(kendaraan5);
                    daftarRental.add13(kendaraan4);
                    daftarRental.add13(kendaraan3);
                    daftarRental.add13(kendaraan2);
                    daftarRental.add13(kendaraan1);
                    daftarRental.rentalprint13();
                    break;
                case 2:
                    if (daftarRental.isEmpty13()) {
                        System.out.println("Kendaraan tidak tersedia");
                    } else {
                        System.out.print("Masukkan Nama Peminjam: ");
                        String namaPeminjam = in.nextLine();
                        System.out.println("Masukkan Nomer TNKB");
                        int noTNKB = in.nextInt();
                        System.out.print("Masukkan Lama Pinjam (jam): ");
                        int lamaPinjam = in.nextInt();

                        System.out.print("Masukkan Nomor TNKB yang dipinjam: ");
                        in.nextLine();
                        String tnkb = in.nextLine();
                        BarangRental13 rentalKdr = null;
                        NodeRental13 current = daftarRental.head;
                        while (current != null) {
                            if (current.dataRental.noTNKB.equals(tnkb)) {
                                rentalKdr = current.dataRental;
                                break;
                            }
                            current = current.next;
                        }
                        if (rentalKdr != null) {
                            double totalBiaya = lamaPinjam * rentalKdr.biayaSewa;
                            TransaksiRental13 transaksiBaru = new TransaksiRental13(noTNKB, namaPeminjam, lamaPinjam, totalBiaya, rentalKdr);
                            daftarTransaksi.add13(transaksiBaru);
                            System.out.println("Transaksi berhasil ditambahkan.");
                        } else {
                            System.out.println("Kendaraan dengan Nomor TNKB tersebut tidak ditemukan.");
                        }
                    }
                    break;
                case 3:
                    daftarTransaksi.print13();
                    break;
                case 4:
                    daftarTransaksi.sorting13();
                    break;
                case 5:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }
    }
}
