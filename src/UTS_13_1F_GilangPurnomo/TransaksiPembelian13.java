package UTS_13_1F_GilangPurnomo;

public class TransaksiPembelian13 {
    String kodeTransaksi;
    String namaPembeli;
    String tanggalPembelian;
    int qty;
    Barang13 brg;

    public TransaksiPembelian13(String kodeTransaksi, String namaPembeli, String tanggalPembelian, int qty, Barang13 brg) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembeli = namaPembeli;
        this.tanggalPembelian = tanggalPembelian;
        this.qty = qty;
        this.brg = brg;
    }

    public void tampilDataTransaksi13 () {
        System.out.println("Kode Transaksi : " + kodeTransaksi);
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("Tanggal Pembelian : " + tanggalPembelian);
        System.out.println("Kuantitas : " + qty);
        System.out.println("Barang : " + brg);
    }
}
