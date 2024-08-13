package UAS_13_1F_GilangPurnomo;

public class DLLRental13 {
    NodeRental13 head;
    int size;

    public DLLRental13() {
        head = null;
        size = 0;
    }

    public boolean isEmpty13() {
        return head == null;
    }

    public int size13() {
        return size;
    }

    public void add13(BarangRental13 data) {
        if (isEmpty13()) {
            head = new NodeRental13(null, data, null);
        } else {
            NodeRental13 newNode = new NodeRental13(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void rentalprint13() {
        if (!isEmpty13()) {
            NodeRental13 current = head;
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Kendaraan Rental Serba Serbi");
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.printf("|%-15s|%-20s|%-10s|%-6s|%-20s|\n", "Nomor TNKB", "Nama Kendaraan", "Jenis", "Tahun", "Biaya Sewa Perjam");
            while (current != null) {
                System.out.printf("|%-15s|%-20s|%-10s|%-6d|%-20d|\n", current.dataRental.noTNKB, current.dataRental.namaKendaraan, current.dataRental.jenisKendaraan,
                        current.dataRental.tahun, current.dataRental.biayaSewa);
                current = current.next;
            }
            System.out.println("+++++++++++++++++++++++++++++++++++");
        } else {
            System.out.println("Data Kendaraan Kosong");
        }
    }

    public void remove13() {
        if (isEmpty13()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            System.out.println(head.dataRental.namaKendaraan + " terhapus.");
            head = null;
            size--;
        } else {
            System.out.println(head.dataRental.namaKendaraan + " terhapus.");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}
