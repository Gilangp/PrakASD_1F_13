package P15.Percobaan1;

import java.util.Scanner;

public class GraphMain13 {
    public static void menu() {
        System.out.println("---------------------");
        System.out.println("Menu");
        System.out.println("---------------------");
        System.out.println("1. Add Edge");
        System.out.println("2. Remove Edge");
        System.out.println("3. Degree");
        System.out.println("4. Print Graph");
        System.out.println("5. Cek Edge");
        System.out.println("6. Update Jarak");
        System.out.println("7. Hitung Edge");
        System.out.println("8. Exit");
        System.out.println("---------------------");
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Graph13 gedung = new Graph13(7);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);


        while (true) {
            menu();
            int pilih = in.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Gedung asal");
                    int asal = in.nextInt();
                    System.out.println("Masukkan Gedung tujuan");
                    int tujuan = in.nextInt();
                    System.out.println("Masukkan jumlah jarak");
                    int jarak = in.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.println("Masukkan Gedung asal");
                    asal = in.nextInt();
                    System.out.println("Masukkan Gedung tujuan");
                    tujuan = in.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.println("Masukkan gedung untuk melihat sisi yang bersebelahan : ");
                    asal = in.nextInt();
                    gedung.degree(asal);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.println("Masukkan Gedung asal");
                    asal = in.nextInt();
                    System.out.println("Masukkan Gedung tujuan");
                    tujuan = in.nextInt();
                    gedung.cekEdge(asal, tujuan);
                    break;
                case 6:
                    System.out.println("Masukkan Gedung asal");
                    asal = in.nextInt();
                    System.out.println("Masukkan Gedung tujuan");
                    tujuan = in.nextInt();
                    System.out.println("Masukkan jumlah jarak");
                    int jarakBaru = in.nextInt();
                    gedung.updateJarak(asal, tujuan, jarakBaru);
                    break;
                case 7:
                    int total = gedung.hitungEdge();
                    System.out.println("Total Edge : " + total);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }
    }
}
