package UAS_13_1F_GilangPurnomo;

public class NodeRental13 {
    BarangRental13 dataRental;
    NodeRental13 prev, next;

    public NodeRental13(NodeRental13 prev, BarangRental13 dataRental, NodeRental13 next) {
        this.prev = prev;
        this.dataRental = dataRental;
        this.next = next;
    }
}
