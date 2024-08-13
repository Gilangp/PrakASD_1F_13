package UTS_13_1F_GilangPurnomo;

import java.util.Scanner;

public class MainSistem13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        ServiceClass13 data = new ServiceClass13();
        Barang13 tpl = new Barang13("Br001", "Leo Kripik", "Makanan", 10, 1000);
        Barang13 tpl1 = new Barang13("Br002", "You C1000 Botol", "Minuman", 10, 7000);
        Barang13 tpl2 = new Barang13("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000);
        Barang13 tpl3 = new Barang13("Br004", "Rinso Cair", "Sabun", 10, 7000);
        Barang13 tpl4 = new Barang13("Br005", "Mama Lemon cair", "Sabun", 10, 1000);

        TransaksiPembelian13 trans = new TransaksiPembelian13(null, null, null, 0, tpl4);
        TransaksiPembelian13 trans1 = new TransaksiPembelian13(null, null, null, 0, tpl4);
        TransaksiPembelian13 trans2 = new TransaksiPembelian13(null, null, null, 0, tpl4);
        TransaksiPembelian13 trans3 = new TransaksiPembelian13(null, null, null, 0, tpl4);
        TransaksiPembelian13 trans4 = new TransaksiPembelian13(null, null, null, 0, tpl4);

        data.tambah13(tpl);
        data.tambah13(tpl1);
        data.tambah13(tpl2);
        data.tambah13(tpl3);
        data.tambah13(tpl4);

        while (true) {
            System.out.println("============= TOKO Manasuka ===========");
            System.out.println("BANK MENU :");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("5. Tampilkan Kode Terbalik");
            System.out.println("6. Exit");
            System.out.print("Chose Menu (1-6) : ");
            int menu = input13.nextInt();
            input13.nextLine();

            switch (menu) {
                case 1:
                    data.tampil13();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.exit(0);
                default:
                System.out.println("Inputan salah, mohon coba lagi.");
                    break;
            }
        }
    }
}
