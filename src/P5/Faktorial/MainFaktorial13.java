package P5.Faktorial;

import java.util.Scanner;

public class MainFaktorial13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = input13.nextInt();

        Faktorial13[] fk = new Faktorial13[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial13();
            System.out.println("Masukkan nilai data ke-" + (i+1) + ": ");
            int iNilai = input13.nextInt();
            fk[i].nilai = iNilai;
        }

        System.out.println("HASIL BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DEVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
