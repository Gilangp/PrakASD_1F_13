package P3.AOBpersegiPanjang;

import java.util.Scanner;

public class ArrayObjects13 {
    public static void main(String[] args) {
        Persegi13[] pgArray = new Persegi13[100];
        pgArray[5].sisi = 20;

        PersegiPanjang13[][] ppArray = new PersegiPanjang13[3][2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < ppArray[i].length; j++) {
                ppArray[i][j] = new PersegiPanjang13();
                System.out.println("Persegi Panjang ke-" + i + "," + j);
                System.out.print("Masukkan Panjang: ");
                ppArray[i][j].panjang = sc.nextInt();
                System.out.print("Masukkan Lebar: ");
                ppArray[i][j].lebar = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < ppArray[i].length; j++) {
                System.out.println("Persegi Panjang ke-" + i + " dan " + j);
                System.out.println("Panjang : " + ppArray[i][j].panjang + "Lebar : " + ppArray[i][j].lebar);
            }
        }
    }
}
