package P11.Tugas_P11.LayananUnitKemahasiswaan;

public class SLLMhsQueueMain13 {
    public static void main(String[] args) {
        SLLMhsQueue13 antrian = new SLLMhsQueue13();

        MhsQueue13 Mhs1 = new MhsQueue13(111, "Anton");
        MhsQueue13 Mhs2 = new MhsQueue13(112, "Prita");
        MhsQueue13 Mhs3 = new MhsQueue13(113, "Yusuf");
        MhsQueue13 Mhs4 = new MhsQueue13(114, "Doni");
        MhsQueue13 Mhs5 = new MhsQueue13(115, "Sari");
        
        antrian.print();
        antrian.Enqueue(Mhs2);
        antrian.print();
        antrian.Enqueue(Mhs4);
        antrian.print();
        antrian.Dequeue();
        antrian.Enqueue(Mhs1);
        antrian.print();
        antrian.Enqueue(Mhs5);
        antrian.print();
        antrian.Enqueue(Mhs3);
        antrian.print();
        antrian.Dequeue();
        antrian.Dequeue();
        antrian.print();
    }
}
