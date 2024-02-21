package P1;

import java.util.Scanner;;

public class tugas2_13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        while (true) {
            // Tampilan menu
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = input13.nextInt();

            if (pilihan == 4) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            }

            switch (pilihan) {
                case 1:
                    hitungKecepatan(input13);
                    break;
                case 2:
                    hitungJarak(input13);
                    break;
                case 3:
                    hitungWaktu(input13);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    // menghitung kecepatan
    static void hitungKecepatan(Scanner input13) {
        System.out.print("Masukkan jarak (m): ");
        double jarak = input13.nextDouble();

        System.out.print("Masukkan waktu (s): ");
        double waktu = input13.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan = " + kecepatan + " m/s");
    }

    // menghitung jarak
    static void hitungJarak(Scanner input13) {
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = input13.nextDouble();

        System.out.print("Masukkan waktu (s): ");
        double waktu = input13.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak = " + jarak + " meter");
    }

    // menghitung waktu
    static void hitungWaktu(Scanner input13) {
        System.out.print("Masukkan jarak (m): ");
        double jarak = input13.nextDouble();

        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = input13.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu = " + waktu + " detik");
    }
}
