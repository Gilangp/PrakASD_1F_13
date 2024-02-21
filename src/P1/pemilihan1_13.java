package P1;

import java.util.Scanner;

public class pemilihan1_13 {
    public static void main(String[] args) {
        float tugas, kuis, uts, uas, total;
        
        String pesan, pesan1;
        Scanner input13 = new Scanner(System.in);

        System.out.println("Program Menghitung Nila Akhir");
        System.out.println("========================");
        System.out.print("Masukkan nilai Tugas :");
        tugas = input13.nextFloat();
        System.out.print("Masukkan nilai Kuis  :");
        kuis = input13.nextFloat();
        System.out.print("Masukkan nilai UTS   :");
        uts = input13.nextFloat();
        System.out.print("Masukkan nilai UAS   :");
        uas = input13.nextFloat();

        if (tugas <= 100 && kuis <= 100 && uts <= 100 && uas <=100) {
            total = (tugas * 0.2F) + (kuis * 0.2F) + (uts * 0.3F) + (uas * 0.3F);
            
            if (total <=100 && total > 80) {
                pesan = "A";
                pesan1 = "SELAMAT ANDA LULUS";
            } else if (total <= 80 && total > 73) {
                pesan = "B+";
                pesan1 = "SELAMAT ANDA LULUS";
            } else if (total <= 73 && total > 65) {
                pesan = "B";
                pesan1 = "SELAMAT ANDA LULUS";
            } else if (total <= 65 && total > 60) {
                pesan = "C+";
                pesan1 = "SELAMAT ANDA LULUS";
            } else if (total <= 60 && total > 50) {
                pesan = "C";
                pesan1 = "SELAMAT ANDA LULUS";
            } else if (total <= 50 && total > 39) {
                pesan = "D";
                pesan1 = "ANDA TIDAK LULUS";
            } else {
                pesan = "E";
                pesan1 = "ANDA TIDAK LULUS";
            }

            System.out.println("========================");
            System.out.println("=======================");
            System.out.println("Nilai akhir : " + total);
            System.out.println("Nilai Huruf : " + pesan);
            System.out.println("========================");
            System.out.println("========================");
            System.out.println(pesan1);
            
        } else {
            System.out.println("=========================");
            System.out.println("=========================");
            System.out.println("nilai tidak valid");
            System.out.println("=========================");
            System.out.println("=========================");
        }
    }
}
