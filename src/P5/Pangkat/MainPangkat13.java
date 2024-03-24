package P5.Pangkat;

import java.util.Scanner;

public class MainPangkat13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = input13.nextInt();

        Pangkat13[] png = new Pangkat13[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = input13.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            int pgt = input13.nextInt();
            png[i] = new Pangkat13(nilai, pgt);
        }

        System.out.println("Menu");
        System.out.println("1. Perhitungan pangkat menggunakan method Brute Force");
        System.out.println("2. Perhitungan pangkat menggunakan method Devide and Conquer");
        int pilihan = input13.nextInt();

        switch (pilihan) {
            case 1 :
                System.out.println("HASIL PANGKAT BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " 
                        + png[i].nilai + " pangkat "
                        + png[i].pangkat + " adalah "
                        + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                    }
                break;
            case 2 :
                System.out.println("HASIL PANGKAT - DEVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                System.out.println("Hasil dari " 
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                    }
                break;
            default:
            System.out.println("Input yang anda masukkan salah");
        }
    }
}
