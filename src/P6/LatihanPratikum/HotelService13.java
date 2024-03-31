package P6.LatihanPratikum;

public class HotelService13 {
    Hotel13 rooms[] = new Hotel13[5];
    int idx;
    
    void tambah(Hotel13 H) {
        if (idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        } else {
            System.out.println("Maaf, kamar sudah penuh");
        }
    }

    void tampil() {
        for (Hotel13 H : rooms ) {
            System.out.println("Hotel " + H.nama);
            System.out.println("Kota    : " + H.kota);
            System.out.println("Harga   : " + H.harga);
            System.out.println("Ranting : " + H.bintang);
        }
    }

    void bubbleSortPrice() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 0; j < rooms.length - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel13 tempHtl = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = tempHtl;
                }
            }
        }
    }

    void selectionSortPrice() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[idxMin].harga) {
                    idxMin = j;
                }
            }
            // swap
            Hotel13 tempHotel = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tempHotel;
        }
    }

    void bubbleSortRanting() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 0; j < rooms.length - i - 1; j++) {
                if (rooms[j].bintang < rooms[j + 1].bintang) {
                    Hotel13 tempHtl = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = tempHtl;
                }
            }
        }
    }

    void selectionSortRanting() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMax].bintang) {
                    idxMax = j;
                }
            }
            // swap
            Hotel13 tmpHotel = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = tmpHotel;
        }
    }
}
