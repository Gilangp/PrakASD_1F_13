package P5.SumArray;

import java.util.Scanner;

public class MainSum13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.println("===========================================================================");
        System.out.println("Program Menghitung keuntungan Total (satuan juta, Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = input13.nextInt();

        Sum13 sm = new Sum13(elm);
        System.out.println("===========================================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke - " + (i + 1) + " = ");
            sm.keuntungan[i] = input13.nextDouble();
        }

        System.out.println("===========================================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("===========================================================================");
        System.out.println("Algoritma Devide and Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
    }
}
