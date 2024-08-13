package Kuis2_13_1F_GilangPurnomo;

import java.util.Scanner;

public class DLLMain13 {
    public static void menu13() {
        System.out.println("Menu");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurututan pesanan by nama");
        System.out.println("5. Hitung total Pendapatan");
        System.out.println("6. Keluar");
        System.out.print("Pilih(1-5): ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLPembeli13 pbl = new DLLPembeli13();

        while (true) {
            menu13();
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("---------------------");
                    System.out.println("Masukkan Data pembeli");
                    System.out.println("---------------------");
                    System.out.print("Nomor Antrian: ");
                    pbl.antrian13();
                    sc.nextLine();
                    System.out.print("Nama Customer: ");
                    String namaCustomer = sc.nextLine();
                    System.out.print("Nomor Hp: ");
                    String noHP = sc.nextLine();
                    Pembeli13 antri = new Pembeli13(namaCustomer, noHP); 
                    pbl.add13(antri);
                    break;
                case 2:
                    pbl.print13();
                    break;
                case 3:
                    pbl.remove13();
                    break;
                case 4:
            
                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi.");
                    break;
            }
        }
    }
}
