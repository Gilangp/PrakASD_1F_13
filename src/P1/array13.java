package P1;

import java.util.Scanner;

public class array13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        // inisialisasi
        String matkul[] = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking  dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Pratikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"};
        int sks[] = {2, 2, 2, 3, 2, 2, 3, 2};
        String nilaiHuruf[] = new String[8];
        double nilaiAngka[] = new double[8];
        double nilaiSetara[] = new double[8];
        double totalsks = 0;
        double totalBobot = 0.0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < matkul.length; i++) {
            while (true) {
                System.out.print("Masukkan nilai Angka untuk MK " + matkul[i] + ": ");
                nilaiAngka[i] = input13.nextDouble();
                break;
            }
        }
        input13.close();

        // konversi nilai angka ke nilai huruf
        System.out.println(
                "=====================================================================================================");
        System.out.format("| %-40s | %-4s | %-5s | %-11s | %-12s |\n", "Mata Kuliah", "SKS", "Nilai", "Nilai Huruf",
                "Nilai Setara");
        System.out.println(
                "=====================================================================================================");
        for (int j = 0; j < matkul.length; j++) {
            if (nilaiAngka[j] <= 100 && nilaiAngka[j] > 80) {
                nilaiHuruf[j] = "A";
            } else if (nilaiAngka[j] <= 80 && nilaiAngka[j] > 73) {
                nilaiHuruf[j] = "B+";
            } else if (nilaiAngka[j] <= 73 && nilaiAngka[j] > 65) {
                nilaiHuruf[j] = "B";
            } else if (nilaiAngka[j] <= 65 && nilaiAngka[j] > 60) {
                nilaiHuruf[j] = "C+";
            } else if (nilaiAngka[j] <= 60 && nilaiAngka[j] > 50) {
                nilaiHuruf[j] = "C";
            } else if (nilaiAngka[j] <= 50 && nilaiAngka[j] > 39) {
                nilaiHuruf[j] = "D";
            } else {
                nilaiHuruf[j] = "E";
            }

            // konversi nilai huruf ke nilai setara
            switch (nilaiHuruf[j]) {
                case "A":
                    nilaiSetara[j] = 4.0;
                    break;
                case "B+":
                    nilaiSetara[j] = 3.5;
                    break;
                case "B":
                    nilaiSetara[j] = 3.0;
                    break;
                case "C+":
                    nilaiSetara[j] = 2.5;
                    break;
                case "C":
                    nilaiSetara[j] = 2.0;
                    break;
                case "D":
                    nilaiSetara[j] = 1.0;
                    break;
                case "E":
                    nilaiSetara[j] = 0.0;
                    // default:
                    // nilaiSetara[i] = 0.0;
            }

            double bobot = sks[j] * nilaiSetara[j];
            totalBobot += bobot;
            totalsks += sks[j];

            // Menampilkan hasil konversi nilai per mata kuliah
            System.out.printf("| %-40s | %-4d | %-5.1f | %-11s | %-12.1f |\n", matkul[j], sks[j], nilaiAngka[j],
                    nilaiHuruf[j], nilaiSetara[j]);
        }

        if (totalsks > 0) {
            double nilaiAkhir = totalBobot / totalsks;
            System.out.println(
                    "=====================================================================================================");
            System.out.printf("IP   %-4.2f\n", nilaiAkhir);
            System.out.println(
                    "=====================================================================================================");
        }
    }
}
