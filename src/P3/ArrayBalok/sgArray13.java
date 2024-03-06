package P3.ArrayBalok;

public class sgArray13 {
    public static void main(String[] args) {
        Segitiga13[] sgArray = new Segitiga13[4];

        sgArray[0] = new Segitiga13(10, 4);
        sgArray[1] = new Segitiga13(20, 10);
        sgArray[2] = new Segitiga13(15, 6);
        sgArray[3] = new Segitiga13(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("Segitiga ke-" + i + " dengan Luas: " + sgArray[i].hitungLuas() + " dan Keliling: " + sgArray[i].hitungKeliling());
        }
    }
}
