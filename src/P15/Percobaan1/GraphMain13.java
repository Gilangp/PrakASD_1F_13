package P15.Percobaan1;

import java.util.Scanner;

public class GraphMain13 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Graph13 gedung = new Graph13(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        System.out.print("Masukkan gedung asal : ");
        int asal = in.nextInt();
        System.out.print("Masukkan gedung tujuan : ");
        int tujuan = in.nextInt();
        gedung.adjacent(asal, tujuan);
    }
}
