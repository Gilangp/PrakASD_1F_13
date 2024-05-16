package P11.Tugas_P11.Mahasiswa13;

public class SLLMhsMain13 {
    public static void main(String[] args) {
        SLLMhs13 singLL = new SLLMhs13();

        Mahasiswa13 Mhs1 = new Mahasiswa13(111, "Anton");
        Mahasiswa13 Mhs2 = new Mahasiswa13(112, "Prita");
        Mahasiswa13 Mhs3 = new Mahasiswa13(113, "Yusuf");
        Mahasiswa13 Mhs4 = new Mahasiswa13(114, "Doni");
        Mahasiswa13 Mhs5 = new Mahasiswa13(115, "Sari");
        
        singLL.print();
        singLL.addFirst(Mhs2);
        singLL.print();
        singLL.addLast(Mhs4);
        singLL.print();
        singLL.addFirst(Mhs1);
        singLL.print();
        singLL.insertAfter(114, Mhs5);
        singLL.print();
        singLL.insertAt(2, Mhs3);
        singLL.print();
    }
}
