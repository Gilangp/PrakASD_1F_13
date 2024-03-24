package P5.Pangkat;

public class Pangkat13 {
    public int nilai, pangkat;

    public Pangkat13 (int nilai, int pgt) {
        this.nilai = nilai;
        pangkat = pgt;
    }

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n ; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 1) {
            return a;
        } else {
                if (n%2 == 1) 
            { 
                return (pangkatDC(a, n/2))*pangkatDC(a, n/2)*a;
            } else {
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
    }
}
