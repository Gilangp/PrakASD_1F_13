package UTS_13_1F_GilangPurnomo;

public class ServiceClass13 {
    Barang13 brg[] = new Barang13[5];
    TransaksiPembelian13 trs[] = new TransaksiPembelian13[5];
    int index;

    void tambah13(Barang13 tpl) {
        if (index < brg.length) {
            brg[index] = tpl;
            index++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil13() {
        for (Barang13 tpl : brg) {
            tpl.tampilDataBarang13();
        }
    }

    void tambah13(TransaksiPembelian13 trans) {
        if (index < trs.length) {
            trs[index] = trans;
            index++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil132() {
        for (TransaksiPembelian13 trans : trs) {
            trans.tampilDataTransaksi13();
        }
    }
}
