package P8.Gudang13;

public class Gudang13 {
    Barang13[] tumpukan;
    int size;
    int top;

    public Gudang13(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang13[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang13 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan Ke Gudang");
        } else {
            System.out.println("Gagal Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang13 ambilBarang() {
        if (!cekKosong()) {
            Barang13 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang13 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang13 barangTeratas =  tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");

            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, 
                tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi13 stack = new StackKonversi13();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public Barang13 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang13 barangTerbawah =  tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang13 cariBarang(int kodeBarang) {
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].kode == kodeBarang) {
                    System.out.println("Kode Barang " + kodeBarang + " ditemukan: ");
                    System.out.println("Nama Barang : " + tumpukan[i].nama);
                    System.out.println("Kode Barang : " + tumpukan[i].kode);
                    System.out.println("Kategori Barang : " + tumpukan[i].kategori);
                    return tumpukan[i];
                }
            }
            System.out.println("Kode Barang " + kodeBarang + " tidak ditemukan.");
            return null;
        } else {
            System.out.println("Data pada tumpukan kosong");
            return null;
        }
    }
}
