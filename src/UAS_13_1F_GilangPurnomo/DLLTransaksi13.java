package UAS_13_1F_GilangPurnomo;

public class DLLTransaksi13 {
    NodeTransaksi13 head;
    int size;

    public DLLTransaksi13() {
        head = null;
        size = 0;
    }

    public boolean isEmpty13() {
        return head == null;
    }

    public int size13() {
        return size;
    }

    public void add13(TransaksiRental13 data) {
        if (isEmpty13()) {
            head = new NodeTransaksi13(null, data, null);
        } else {
            NodeTransaksi13 newNode = new NodeTransaksi13(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void print13() {
        if (!isEmpty13()) {
            NodeTransaksi13 current = head;
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Seluruh Transaksi");
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.printf("|%-10s|%-20s|%-10s|%-15s|%-10s|%-15s|\n","Kode", "Nama Peminjam", "Lama", "Total Biaya", "TNKB", "Nama Kendaraan");
            while (current != null) {
                TransaksiRental13 transaksi = current.dataTransaksi;
                System.out.printf("|%-10d|%-20s|%-10d|%-15.2f|%-10s|%-15s|\n", transaksi.kodeTransaksi, transaksi.namaPeminjam, transaksi.lamaPinjam, 
                        transaksi.totalBiaya, transaksi.br.noTNKB, transaksi.br.namaKendaraan);
                current = current.next;
            }
            System.out.println("+++++++++++++++++++++++++++++++++++");
        } else {
            System.out.println("Tidak ada transaksi yang tersedia.");
        }
    }

    public void sorting13() {
        if (size <= 1) {
            return;
        }

        boolean swap;
        NodeTransaksi13 current;
        NodeTransaksi13 terakhir = null;

        do {
            swap = false;
            current = head;

            while (current.next != terakhir) {
                if (current.dataTransaksi.br.noTNKB.compareTo(current.next.dataTransaksi.br.noTNKB) < 0) {
                    TransaksiRental13 temp = current.dataTransaksi;
                    current.dataTransaksi = current.next.dataTransaksi;
                    current.next.dataTransaksi = temp;
                    swap = true;
                }
                current = current.next;
            }
            terakhir = current;
        } while (swap);
    }
}

