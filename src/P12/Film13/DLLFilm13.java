package P12.Film13;

public class DLLFilm13 {
    Node13 head;
    int size;

    public DLLFilm13() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void addFirst(DaftarFilm13 data) {
        if (isEmpty()) {
            head = new Node13(null, data, null);
        } else {
            Node13 newNode = new Node13(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(DaftarFilm13 data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node13 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node13 newNode = new Node13(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(DaftarFilm13 data, int index) throws Exception {
        if (isEmpty()) {
            addFirst(data);
        } else if (index < 0 || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        } else {
            Node13 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node13 newNode = new Node13(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node13 newNode = new Node13(current.prev, data, current);
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public void removeFisrt() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node13 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFisrt();
        } else {
            Node13 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node13 current = head;
            System.out.println("Cetak Data");
            while (current != null) {
                System.out.println("ID : " + current.dataFilm.id);
                System.out.println("\tJudul Film : " + current.dataFilm.judul);
                System.out.println("\tRating Film : " + current.dataFilm.rating);
                current = current.next;
            }
        } else {
            System.out.println("Data Film Kosong");
        }
    }

    public void getID (int id) throws Exception {
        if (isEmpty()) {
            throw new Exception("Data Film Kosong");
        } else {
            Node13 current = head;
            for (int i = 0; i < size; i++) {
                if (current.dataFilm.id == id) {
                    System.out.println("Data ID Film: " + id + "berada di node ke- " + (i + 1));
                    System.out.println("IDENTITAS: ");
                    System.out.println("\tID Film : " + current.dataFilm.id);
                    System.out.println("\tJudul Film : " + current.dataFilm.judul);
                    System.out.println("\tIMDB Rating : " + current.dataFilm.rating);
                    break;
                }
                current = current.next;
            }
        }
    }

    public void bubbleSortRating() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data Film Kosong.");
        } else {
            for (int i = 0; i < size - 1; i++) {
                Node13 current = head;
                for (int j = 0; j < size - 1; j++) {
                    if (current.dataFilm.rating < current.next.dataFilm.rating) {
                        DaftarFilm13 tmp = current.dataFilm;
                        current.dataFilm = current.next.dataFilm;
                        current.next.dataFilm = tmp;
                    }
                    current = current.next;
                }
            }
        }
    }
    
}
