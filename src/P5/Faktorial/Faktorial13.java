package P5.Faktorial;

public class Faktorial13 {
    public int nilai;

    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 0; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } 
        else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
