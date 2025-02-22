package P7;

public class PencarianBuku13 {
    Buku13 listBk[] = new Buku13[5];
    int idx;

    void tambah(Buku13 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku13 m : listBk) {
            m.tampilDataBuku();
        }
    }

    // public int FindSeqSearch(int cari) {
    //     int posisi = -1;
    //     for (int j = 0; j < listBk.length; j++) {
    //         if (listBk[j].kodeBuku == cari) {
    //             posisi = j;
    //             break;
    //         }
    //     }
    //     return posisi;
    // }

    public void Tampilposisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    public void TambahData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode buku\t : " + x);
            System.out.println("Judul buku\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t\t : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    // public Buku13 FindBuku (int cari) {
    //     for (int j = 0; j < listBk.length; j++) {
    //         if (listBk[j].kodeBuku == cari) {
    //             return listBk[j];
    //         }
    //     }
    //     return null;
    // }

    // public int FindBinarySearch(int cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (right + left) / 2;
    //         if (cari == listBk[mid].kodeBuku) {
    //             return (mid);
    //         } else if (listBk[mid].kodeBuku < cari) {
    //             return FindBinarySearch(cari, left, mid - 1);
    //         } else {
    //             return FindBinarySearch(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }

    // public int FindSeqSearchString(String cari) {
    //     int posisi = -1;
    //     for (int j = 0; j < listBk.length; j++) {
    //         if (listBk[j].kodeBuku.equals(cari)) {
    //             posisi = j;
    //             break;
    //         }
    //     }
    //     return posisi;
    // }

    // public int FindBinarySearchString(String cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (right + left) / 2;
    //         int Intcari = Integer.parseInt(cari);
    //         if (Intcari == Integer.parseInt(listBk[mid].kodeBuku)) {
    //             return (mid);
    //         } else if (Integer.parseInt(listBk[mid].kodeBuku) > Intcari) {
    //             return FindBinarySearchString(cari, left, mid - 1);
    //         } else {
    //             return FindBinarySearchString(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }

    // sorting
    void bubbleSort() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j < listBk.length - i - 1; j++) {
                if (Integer.parseInt(listBk[j].kodeBuku) > Integer.parseInt(listBk[j + 1].kodeBuku)) {
                    Buku13 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }

    public int FindSeqSearchJudul(String cariJudul) {
        int posisi = -1;
        int jumJudul = 0;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cariJudul)) {
                posisi = j;
                jumJudul++;
            }
        }
        if (jumJudul > 1) {
            for (int j = 0; j < listBk.length; j++) {
                if (listBk[j].judulBuku.equalsIgnoreCase(cariJudul)) {
                    listBk[j].tampilDataBuku();
                    System.out.println("Peringatan: judul lebih dari satu");
                }
            }
        } else if (jumJudul == 1) {
            System.out.println("Buku dengan judul " + cariJudul + " Ditemukan");
            for (int j = 0; j < listBk.length; j++) {
                if (listBk[j].judulBuku.equalsIgnoreCase(cariJudul)) {
                    listBk[j].tampilDataBuku();
                }
            }
        }
        return posisi;
    }

    public int FindBinarySearchJudul(String cariJudul, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right - left) / 2;
            int cari = listBk[mid].judulBuku.compareToIgnoreCase(cariJudul);
            if (cari == 0) {
                return mid;
            } else if (cari < 0) {
                return FindBinarySearchJudul(cariJudul, left, mid - 1);
            } else {
                return FindBinarySearchJudul(cariJudul, mid + 1, right);
            }
        }
        return -1;
    }
}
