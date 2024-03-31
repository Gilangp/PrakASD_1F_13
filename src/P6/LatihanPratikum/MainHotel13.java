package P6.LatihanPratikum;

import java.util.Scanner;

public class MainHotel13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        HotelService13 listrooms = new HotelService13();
        Hotel13 H = new Hotel13("Grand Candra", "Malang", 457000, (byte) 5.6);
        Hotel13 H1 = new Hotel13("Viva Hotel", "Kediri", 406000, (byte) 3.5);
        Hotel13 H2 = new Hotel13("Wyndham", "Surabaya", 742000, (byte)9.0);
        Hotel13 H3 = new Hotel13("Royal Ambarrukmo", "Yogyakarta", 1450000, (byte) 10.0);
        Hotel13 H4 = new Hotel13("Grand Surya", "Kediri", 900000, (byte)7.8);
        

        listrooms.tambah(H);
        listrooms.tambah(H1);
        listrooms.tambah(H2);
        listrooms.tambah(H3);
        listrooms.tambah(H4);

        System.out.println("************");
        System.out.println("Daftar Hotel");
        System.out.println("************");
        listrooms.tampil();

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Filter Berdasarkan Harga");
            System.out.println("2. Filter Berdasarkan Ranting");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu : ");
            int pilihan = input13.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("*********************************************");
                    System.out.println("List berdasarkan harga termurah | Bubble Sort");
                    System.out.println("*********************************************");
                    listrooms.bubbleSortPrice();
                    listrooms.tampil();
                    System.out.println("************************************************");
                    System.out.println("List berdasarkan harga termurah | Selection Sort");
                    System.out.println("************************************************");
                    listrooms.selectionSortPrice();
                    listrooms.tampil();
                    break;
                case 2:
                    System.out.println("***********************************************");
                    System.out.println("List berdasarkan Rnting tertinggi | Bubble Sort");
                    System.out.println("***********************************************");
                    listrooms.bubbleSortRanting();
                    listrooms.tampil();
                    System.out.println("***************************************************");
                    System.out.println("List berdasarkan Ranting tertinggi | Selection Sort");
                    System.out.println("***************************************************");
                    listrooms.selectionSortRanting();
                    listrooms.tampil();
                    break;
                case 3:
                    System.exit(0);
                break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }
    }
}
