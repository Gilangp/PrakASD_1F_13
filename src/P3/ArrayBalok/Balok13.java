package P3.ArrayBalok;

public class Balok13 {
    public int panjang;
    public int lebar;
    public int tinggi;

    // konstruktor berparameter
    public Balok13(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    // konstruktor tanpa parameter
    public Balok13() {
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
