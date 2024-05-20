package P12.Vaksinasi13;

import java.util.Scanner;

public class VaksinasiMain13 {
    public static void menu() {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists13 antrian = new DoubleLinkedLists13();

        while (true) {
            menu();
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor Antrian: ");
                    int noAntri = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nama Penerima: ");
                    String nama = sc.nextLine();
                    Antrian13 antri = new Antrian13(noAntri, nama);
                    antrian.Enqueue(antri);
                    break;
                case 2:
                    antrian.Dequeue();
                    antrian.print();
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    System.exit(0);        
                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi.");
            }
        }
    }
}
