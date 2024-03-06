package P3.InformasiMahasiswa;

import java.util.Scanner;

public class InfoMhsArray {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        InformasiMhs[] mhsArray = new InformasiMhs[3];

        for (int i = 0; i < mhsArray.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama : ");
            String namaMhs = input13.nextLine();
            System.out.print("Masukkan NIM : ");
            int nim = input13.nextInt();
            input13.nextLine();

            System.out.print("Masukan jenis kelamin (L/P) : ");
            char jenisKelamin = input13.next().charAt(0);
            while (!(jenisKelamin == 'L' || jenisKelamin == 'P')) {
                System.out.println("Jenis kelamin tidak valid");
                System.out.println("Masukkan Jenis Kelamin lagi :");
                jenisKelamin = input13.next().charAt(0);
            }

            System.out.print("Masukkan IPK : ");
            double ipk = input13.nextDouble();
            input13.nextLine();

            mhsArray[i] = new InformasiMhs(namaMhs, nim, jenisKelamin, ipk);
        }

        // menghitung rata- rata ipk
        double rataIpk = mhsArray[0].hitungRataRataIpk(mhsArray);
        System.out.println("Rata - rata IPK: " + rataIpk);

        // menampilkan Informasi Mahasiswa dari ipk terbesar
        InformasiMhs ipkTerbesar = mhsArray[0].ipkTerbesar(mhsArray);
        ipkTerbesar.tampilInformasi();
    }
}
