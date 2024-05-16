package P11.Tugas_P11.Mahasiswa13;

public class SLLMhs13 {
    Node13 head, tail;

    boolean isEmpty() {
        return head == null && tail == null;
    }

    void print() {
        if (!isEmpty()) {
            Node13 tmp = head;
            System.out.println("Isi Linked List:  ");
            while (tmp != null) {
                System.out.println("NIM : " + tmp.data.nim);
                System.out.println("Nama : " + tmp.data.nama);
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(Mahasiswa13 input) {
        Node13 ndInput = new Node13(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa13 input) {
        Node13 ndInput = new Node13(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, Mahasiswa13 input) {
        Node13 ndinput = new Node13(input, null);
        Node13 temp = head;
        do {
            if(temp.data.nim == key) {
                ndinput.next = temp.next;
                temp.next = ndinput;
                if (ndinput.next == null) {
                    tail = ndinput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, Mahasiswa13 input) {
        Node13 ndInput = new Node13(input, null);
        if (index < 0) {
            System.out.println("perbaiki logikanya!"
                    + "kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node13 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node13(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
