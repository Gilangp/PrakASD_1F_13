package UAS_13_1F_GilangPurnomo;

public class TransaksiRental13 {
    int kodeTransaksi, lamaPinjam;
    String namaPeminjam;
    double totalBiaya;
    BarangRental13 br;

    public TransaksiRental13(int kodeTransaksi, String namaPeminjam, int lamaPinjam , double totalBiaya, BarangRental13 br) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBiaya;
        this.br = br;
    }

}
