package P12.Vaksinasi13;

public class Node13 {
    Antrian13 pengantri;
    Node13 prev, next;


    public Node13(Node13 prev, Antrian13 pengantri, Node13 next) {
        this.prev = prev;
        this.pengantri = pengantri;
        this.next = next;
    }

}
