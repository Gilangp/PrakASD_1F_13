package Kuis2_13_1F_GilangPurnomo;

public class DLLPembeli13 {
    NodePembeli13 head;
    int size;

    public DLLPembeli13() {
        head = null;
        size = 0;
    }

    public boolean isEmpty13() {
        return head == null;
    }

    public int size13() {
        return size;
    }

    public void antrian13() {
        for (int i = 0; i <= 4; i++) {
            System.out.println(i + 1);
            break;
        }
    }

    public void add13(Pembeli13 data) {
        if (isEmpty13()) {
            head = new NodePembeli13(null, data, null);
        } else {
            NodePembeli13 newNode = new NodePembeli13(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void print13() {
        if (!isEmpty13()) {
            // String antri = antrian13();
            NodePembeli13 current = head;
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Antrian Resto Royal Delisah");
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("|No.        |Nama Customer          |No hp          |");
            while (current != null) {
                // System.out.printf("|    %-7d|       %-7d|       %-7s|\n",antrian13(), current.dataPembeli.namaPembeli, current.dataPembeli.NoHp);
                current = current.next;
            }
        } else {
            System.out.println("Data Film Kosong");
        }
    }

    public void remove13() {
        if (isEmpty13()) {
            System.out.println ("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            System.out.println(head.dataPembeli.namaPembeli + " telah memesan menu.");
            head = null;
        } else {
            System.out.println(head.dataPembeli.namaPembeli + " telah memesan menu.");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}
