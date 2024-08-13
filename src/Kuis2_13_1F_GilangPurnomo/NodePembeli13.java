package Kuis2_13_1F_GilangPurnomo;

public class NodePembeli13 {
    Pembeli13 dataPembeli;
    NodePembeli13 prev, next;

    public NodePembeli13(NodePembeli13 prev, Pembeli13 dataPembeli, NodePembeli13 next) {
        this.prev = prev;
        this.dataPembeli = dataPembeli;
        this.next = next;
    }

}
