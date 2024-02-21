package P1;

import java.util.Scanner;

public class tugas1_13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        // Array kode plat
        char[] KODE = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        // Array nama kota [10][12]
        String[][] KOTA = {
            {"BANTEN", " "}, 
            {"JAKARTA", " "},
            {"BANDUNG", " "},
            {"CIREBON", " "},
            {"BOGOR", " "},
            {"PEKALONGAN", " "},
            {"SEMARANG", " "},
            {"SURABAYA", " "},
            {"MALANG", " "},
            {"TEGAL", " "}
        };

        // Input kode plat nomor
        System.out.print("Masukkan kode plat : ");
        char inputKode = input13.next().toUpperCase().charAt(0);

        // Mencari nama kota berdasarkan kode plat
        String namaKota = null;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                namaKota = KOTA[i][0];
                break;
            }
        }

        // output
        if (namaKota != null) {
            System.out.println("Kota yang sesuai dengan plat: " + namaKota);
        } else {
            System.out.println("Kode plat mobil tidak valid.");
        }
    }
}
