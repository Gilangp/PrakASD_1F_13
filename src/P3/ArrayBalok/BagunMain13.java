package P3.ArrayBalok;

public class BagunMain13 {
    public static void main(String[] args) {
        Segitiga13 sg1 = new Segitiga13(5, 10);
        Segitiga13 sg2 = new Segitiga13(10, 15);
        Segitiga13 sg3 = new Segitiga13(15, 20);

        PersegiPanjang13 pp1 = new PersegiPanjang13(5, 10);
        PersegiPanjang13 pp2 = new PersegiPanjang13(2, 8);
        PersegiPanjang13 pp3 = new PersegiPanjang13(10, 15);

        Segitiga13[] s = new Segitiga13[3];
        PersegiPanjang13[] p = new PersegiPanjang13[3];

        s[0] = sg1;
        s[1] = sg2;
        s[2] = sg3;
        p[0] = pp1;
        p[1] = pp2;
        p[2] = pp3;

        BagunDatar13 bd = new BagunDatar13();
        bd.tambahSgt(s);
        bd.tambahPp(p);
        bd.tampilBangunDatar();
    }
}
