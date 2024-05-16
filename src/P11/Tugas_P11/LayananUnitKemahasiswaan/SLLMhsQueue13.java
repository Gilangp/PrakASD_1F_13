package P11.Tugas_P11.LayananUnitKemahasiswaan;

public class SLLMhsQueue13 {
    NodeQueue13 front, rear;

    boolean isEmpty() {
        return front == null && rear == null;
    }

    void print() {
        if (!isEmpty()) {
            NodeQueue13 tmp = front;
            System.out.println("Data Antrian:   ");
            while (tmp != null) {
                System.out.println("NIM : " + tmp.dataMhs.nim);
                System.out.println("Nama : " + tmp.dataMhs.nama);
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void Enqueue(MhsQueue13 input) {
        NodeQueue13 ndInput = new NodeQueue13(input, null);
        if (isEmpty()) {
            front = ndInput;
            rear = ndInput;
        } else {
            rear.next = ndInput;
            rear = ndInput;
        }
    }

    void Dequeue() {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
            return;
        } else if (front == rear) {
            System.out.println("Data yang keluar = NIM : " + front.dataMhs.nim + " | "
                                + "| Nama : " + front.dataMhs.nama);
            front = rear = null;
        } else {
            MhsQueue13 tmp = front.dataMhs;
            front = front.next;
            System.out.println("Data yang keluar = NIM : " + tmp.nim + " | "
                                + "Nama : " + tmp.nama);
        }
    }
}
