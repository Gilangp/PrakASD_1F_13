package UAS_13_1F_GilangPurnomo;

public class NodeTransaksi13 {
    TransaksiRental13 dataTransaksi;
    NodeTransaksi13 prev, next;

    public NodeTransaksi13(NodeTransaksi13 prev, TransaksiRental13 dataTransaksi, NodeTransaksi13 next) {
        this.prev = prev;
        this.dataTransaksi = dataTransaksi;
        this.next = next;
    }
}
