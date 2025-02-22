package P6;

public class DaftarBuku13 {
    Buku13 listBk[] = new Buku13[5];
    int idx;

    void tambah(Buku13 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku13 m : listBk) {
            m.tampilDataBuku();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j < listBk.length - i - 1; j++) {
                if (listBk[j].stock > listBk[j + 1].stock) {
                    Buku13 tempBk = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = tempBk;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listBk.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < listBk.length; j++) {
                if (listBk[j].stock > listBk[idxMax].stock) {
                    idxMax = j;
                }
            }
            // swap
            Buku13 tempBuku = listBk[idxMax];
            listBk[idxMax] = listBk[i];
            listBk[i] = tempBuku;
        }
    }

    void insertionSort() {
        for (int i = 0; i < listBk.length; i++) {
            Buku13 temp = listBk[i];
            int j = i;
            while (j > 0 && listBk[j - 1].stock < temp.stock) {
                listBk[j] = listBk[j - 1];
                j--;
            }
            listBk[j] = temp;
        }
    }
}

