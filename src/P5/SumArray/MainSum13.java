package P5.SumArray;

import java.util.Scanner;

public class MainSum13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.println("===========================================================================");
        System.out.println("Program Menghitung keuntungan Total (satuan juta, Misal 5.9)");
        System.out.print("Masukkan jumlah Perusahaan : ");
        int perusahaan = input13.nextInt();
        Sum13[] prs = new Sum13[perusahaan];
        
        System.out.println("===========================================================================");
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("");
            System.out.println("Perusahaan " + (i + 1));
            System.out.print("Masukkan jumlah bulan : ");
            int bln = input13.nextInt();
            double[] keuntungan = new double[bln];
            
            System.out.println("Masukkan keuntungan setiap Bulan : ");
            for (int j = 0; j < bln; j++) {
                System.out.print("Keuntungan bulan ke " + (j + 1) + " = ");
                keuntungan[j] = input13.nextDouble();
            }
            prs[i] = new Sum13(keuntungan.length);
            prs[i].keuntungan = keuntungan;
        }

        System.out.println("===========================================================================");
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("Perushaan " + (i + 1));
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan selama " + prs[i].keuntungan.length 
            + " bulan adalah = " + prs[i].totalBF(prs[i].keuntungan));
            System.out.println("===========================================================================");
            System.out.println("Algoritma Devide and Conquer");
            System.out.println("Total keuntungan selama " + prs[i].keuntungan.length 
            + " bulan adalah = " + prs[i].totalDC(prs[i].keuntungan, 0, prs[i].keuntungan.length - 1));
            System.out.println("===========================================================================");
            System.out.println("");
        }
    }
}
