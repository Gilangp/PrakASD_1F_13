package P3.ArrayBalok;

public class BagunDatar13 {
    Segitiga13[] segitiga13s;
    PersegiPanjang13[] persegiPanjang13s;

    void tambahSgt(Segitiga13[] segitiga) {
        this.segitiga13s = segitiga;
    }

    void tambahPp(PersegiPanjang13[] persegiPanjang) {
        this.persegiPanjang13s = persegiPanjang;
    }

    void tampilBangunDatar() {
        for (int i = 0; i < persegiPanjang13s.length; i++) {
            System.out.println("Persegi Panjang " + (i + 1));
            System.out.println("Lebar: " + persegiPanjang13s[i].lebar);
            System.out.println("Panjang: " + persegiPanjang13s[i].panjang);
        }
        System.out.println("====================================================");
        for (int j = 0; j < segitiga13s.length; j++) {
            System.out.println("Segitiga " + (j + 1));
            System.out.println("Alas: " + segitiga13s[j].alas);
            System.out.println("Tinggi: " + segitiga13s[j].tinggi);
        }
    }
}
