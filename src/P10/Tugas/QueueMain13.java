package P10.Tugas;

import java.util.Scanner;

public class QueueMain13 {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Pembeli baru");
        System.out.println("2. Pembeli Keluar");
        System.out.println("3. Cek semua Pembeli");
        System.out.println("4. Cek Pembeli terdepan");
        System.out.println("5. Cek Pembeli paling belakang");
        System.out.println("6. Cari Pembeli");
        System.out.println("7. Data seluruh Pembeli");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue13 pembeli = new Queue13(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan No HP pembeli: ");
                    int noHP = sc.nextInt();
                    Pembeli13 pbl = new Pembeli13(nama, noHP);
                    pembeli.Enqueue(pbl);
                    sc.nextLine();
                    break;
                case 2:
                    int pblKeluar = pembeli.Dequeue();
                    if (pblKeluar != 0) {
                        System.out.println("Antrian yang keluar: " + pblKeluar);
                        break;
                    }
                case 3:
                    pembeli.print();
                    break;
                case 4:
                    pembeli.peek();
                    break;
                case 5:
                    pembeli.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama Pembeli: ");
                    nama = sc.nextLine();
                    pembeli.peekPosition(nama);
                    break;
                case 7:
                    System.out.println("Data Seluruh Pembeli");
                    pembeli.daftarPembeli();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
