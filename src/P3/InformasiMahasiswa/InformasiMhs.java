package P3.InformasiMahasiswa;

public class InformasiMhs {
    public String nama;
    public int nim;
    public char kelamin;
    public double ipk;

    public InformasiMhs(String namaMhs, int nim, char jenisKelamin, double ipk) {
        nama = namaMhs;
        this.nim = nim;
        kelamin = jenisKelamin;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jenis Kelamin : " + kelamin);
        System.out.println("IPK : " + ipk);
    }
}
