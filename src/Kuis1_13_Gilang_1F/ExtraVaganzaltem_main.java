package Kuis1_13_Gilang_1F;

import java.util.Scanner;

public class ExtraVaganzaltem_main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ExtraVaganzaltem13[] ExtraVaganzaltem = new ExtraVaganzaltem13[5];

        int menu;
        char kembali;

        do {
            System.out.println("===== APT Pharmacy=====");
            System.out.println("Menu : ");
            System.out.println("1. input data");
            System.out.println("2. display data");
            System.out.println("3. update harga");
            System.out.println("4. penjualan");
            System.out.println("5. exit");
        
            System.out.println("select menu : ");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                for (int i = 0; i < ExtraVaganzaltem.length; i++) {
                    System.out.println("==============================");
                    System.out.print("Masukkan nama :");
                    String nama = in.nextLine();
                    in.nextLine();
                    System.out.print("Masukkan kategori : ");
                    String kategori = in.nextLine();
                    System.out.print("Masukkan jumlah stok : ");
                    int stok = in.nextInt();
                    System.out.print("Masukkan jumlah harga : ");
                    int harga = in.nextInt();
        
                    ExtraVaganzaltem[i] = new ExtraVaganzaltem13(nama, kategori, stok, harga);
                }
        ;
                    break;
                case 2:
                for (int i = 0; i < ExtraVaganzaltem.length; i++) {
                    System.out.println("Tampil data ke-" + (i + 1));
                    ExtraVaganzaltem[i].tampilData();
                }
                default:
                    break;
            }

            System.out.println("Apakah ingin kembali ke menu? (y/n)");
            kembali = in.next().charAt(0);
        } while (kembali != 'n'); 
            System.exit(0);
    }
}
