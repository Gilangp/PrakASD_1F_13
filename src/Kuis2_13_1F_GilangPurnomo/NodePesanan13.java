package Kuis2_13_1F_GilangPurnomo;

public class NodePesanan13 {
    Pesanan13 dataPesanan;
    NodePesanan13 prev, next;

    public NodePesanan13(NodePesanan13 prev, Pesanan13 dataPesanan, NodePesanan13 next) {
        this.prev = prev;
        this.dataPesanan = dataPesanan;
        this.next = next;
    }

}
