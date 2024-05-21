package P12.Film13;

import java.util.Scanner;

public class DLLFilmMain13 {
    public static void menu() {
        System.out.println("===================================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("===================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("===================================");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        DLLFilm13 film = new DLLFilm13();

        while (true) {
            menu();
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("-----------------------");
                    System.out.println("Masukkan Data Film Awal");
                    System.out.println("-----------------------");
                    System.out.println("Id Film : ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("Judul Film : ");
                    String judul = input.nextLine();
                    System.out.println("Rating Film : ");
                    double rating = input.nextDouble();
                    DaftarFilm13 filmAwal = new DaftarFilm13(id, judul, rating);
                    film.addFirst(filmAwal);
                    break;
                case 2:
                    System.out.println("------------------------");
                    System.out.println("Masukkan Data Film Akhir");
                    System.out.println("------------------------");
                    System.out.println("Id Film : ");
                    id = input.nextInt();
                    input.nextLine();
                    System.out.println("Judul Film : ");
                    judul = input.nextLine();
                    System.out.println("Rating Film : ");
                    rating = input.nextDouble();
                    DaftarFilm13 filmAkhir = new DaftarFilm13(id, judul, rating);
                    film.addLast(filmAkhir);
                    break;
                case 3:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Film Urutan ke-");
                    System.out.println("-----------------------------");
                    System.out.println("Id Film : ");
                    id = input.nextInt();
                    input.nextLine();
                    System.out.println("Judul Film : ");
                    judul = input.nextLine();
                    System.out.println("Rating Film : ");
                    rating = input.nextDouble();
                    System.out.print("Data Film ini akan masuk di urutan ke- ");
                    int index = input.nextInt();
                    DaftarFilm13 filmIndex = new DaftarFilm13(id, judul, rating);
                    film.add(filmIndex, index);
                    break;
                case 4:
                    film.removeFisrt();
                    break;
                case 5:
                    film.removeLast();
                    break;
                case 6:
                    System.out.print("Data Film dihapus pada urutan ke- ");
                    index = input.nextInt();
                    film.remove(index - 1);
                    break;
                case 7:
                    film.print();
                    break;
                case 8:
                    System.out.println("Masukkan ID Film yang dicari : ");
                    id = input.nextInt();
                    film.getID(id);
                    break;
                case 9:
                    film.bubbleSortRating();
                    film.print();
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi.");
                    break;
            }
        }
    }
}
