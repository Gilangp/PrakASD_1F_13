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
            png[i] =  new Pangkat13();
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = input13.nextInt();
            png[i].nilai = nilai;
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = input13.nextInt();
            png[i].pangkat = pangkat;
        }

        System.out.println("HASIL PANGKAT BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " 
                + png[i].nilai + " pangkat "
                + png[i].pangkat + " adalah "
                + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("HASIL PANGKAT - DEVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " 
                + png[i].nilai + " pangkat "
                + png[i].pangkat + " adalah "
                + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
