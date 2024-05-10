package P10.Tugas;

public class Queue13 {
    Pembeli13[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue13(int n) {
        max = n;
        antrian = new Pembeli13[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen belakang: " + antrian[rear].nama);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama) {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            boolean antrianDitemukan = false;
            int i = front;
            int posisi = 1;
            while (i != rear) {
                if (antrian[i].nama.equalsIgnoreCase(nama)) {
                    antrianDitemukan = true;
                    break;
                }
                i = (i + 1) % max;
                posisi++;
            }
            if (antrian[i].nama.equalsIgnoreCase(nama)) {
                antrianDitemukan = true;
            }
            if (antrianDitemukan) {
                System.out.println("Antrian ditemukan");
                System.out.println("Nama: " + nama);
                System.out.println("No HP: " + antrian[i].noHP);
                System.out.println("Posisi Antrian: " + posisi);
            } else {
                System.out.println("Antrian dengan nama " + nama + " tidak ditemukan.");
            }
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Pembeli13 antri) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public int Dequeue() {
        int antri = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            antri = front;
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return antri;
    }

    public void daftarPembeli () {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
        }
    }
}
