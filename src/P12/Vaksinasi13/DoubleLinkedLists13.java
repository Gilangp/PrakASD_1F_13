package P12.Vaksinasi13;

public class DoubleLinkedLists13 {
    Node13 head;
    int size;

    public DoubleLinkedLists13() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    void Enqueue(Antrian13 data) {
        if (isEmpty()) {
            head = new Node13(null, data, null);
        } else {
            Node13 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node13 newNode = new Node13(current, data, null);
            current.next = newNode;
        }
        size++;
    }

    public void Dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            System.out.println(head.pengantri.nama + " telah selesai divaksinasi.");
            head = null;
        } else {
            System.out.println(head.pengantri.nama + " telah selesai divaksinasi.");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node13 current = head;
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++");
            System.out.println("|    no    |   nama   |");
            while (current != null) {
                System.out.printf("|   %-7d|   %-7s|\n", current.pengantri.noAntrian, current.pengantri.nama);
                current = current.next;
            }
            System.out.println("Sisa Antrian: " + size);
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
}
