package P3.AOBpersegiPanjang;

import java.util.Scanner;

public class ArrayObjects13 {
    public static void main(String[] args) {
        PersegiPanjang13[] ppArray = new PersegiPanjang13[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang13();
            System.out.println("Persegi Panjang ke-" + i );
            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + "Lebar : " + ppArray[i].lebar);
        }
    }
}
