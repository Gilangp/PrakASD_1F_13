package P3.ArrayBalok;

public class Segitiga13 {
    public int alas;
    public int tinggi;

    public Segitiga13(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return alas * tinggi * 1/2;
    }

    public int hitungKeliling() {
        return alas + tinggi + (int) Math.sqrt(alas * alas + tinggi * tinggi);
    }
}
