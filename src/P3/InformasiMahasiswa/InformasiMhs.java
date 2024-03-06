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

    public double hitungRataRataIpk(InformasiMhs[] mhsArray) {
        double totalIpk = 0;
        for (InformasiMhs mahasiswa : mhsArray) {
            totalIpk += mahasiswa.ipk;
        }
        return totalIpk/mhsArray.length;
    }

    public InformasiMhs ipkTerbesar(InformasiMhs[] mhsArray) {
        InformasiMhs ipkTebesar = mhsArray[0];
        for (int i = 0; i < mhsArray.length; i++) {
            if (mhsArray[i].ipk > ipkTebesar.ipk) {
                ipkTebesar = mhsArray[i];
            }
        }
        return ipkTebesar;
    }
}
