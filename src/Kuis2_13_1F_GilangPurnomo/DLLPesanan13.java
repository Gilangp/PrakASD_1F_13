package Kuis2_13_1F_GilangPurnomo;

public class DLLPesanan13 {
    NodePesanan13 head;
    int size;

    public DLLPesanan13() {
        head = null;
        size = 0;
    }

    public boolean isEmpty13() {
        return head == null;
    }

    public int size13() {
        return size;
    }

    public void add13(Pesanan13 data) {
        if (isEmpty13()) {
            head = new NodePesanan13(null, data, null);
        } else {
            NodePesanan13 newNode = new NodePesanan13(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // public void bubbleSortRating() throws Exception {
    //     if (isEmpty13()) {
    //         System.out.println("Data Film Kosong.");
    //     } else {
    //         for (int i = 0; i < size - 1; i++) {
    //             NodePesanan13 current = head;
    //             for (int j = 0; j < size - 1; j++) {
    //                 if (toString(current.dataPesanan.namaPesanan) < ) {
    //                     DaftarFilm13 tmp = current.dataFilm;
    //                     current.dataFilm = current.next.dataFilm;
    //                     current.next.dataFilm = tmp;
    //                 }
    //                 current = current.next;
    //             }
    //         }
    //     }
    // }
}
