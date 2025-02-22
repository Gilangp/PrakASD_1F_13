package P15.Percobaan1;

public class Graph13 {
    int vertex;
    DoubleLinkedList13 list[];

    public Graph13(int v) {
        vertex = v;
        list = new DoubleLinkedList13[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList13();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // apabila undirected
        // list[tujuan].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            // outDegree
            for ( k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
        // apabila undirected 
        // System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size());
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void adjacent(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
                return;
            }
        }
        System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
    }

    public void cekEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                System.out.println("Jarak antar gedung " + (char) ('A' + asal) + " dan gedung " + (char) ('A' + tujuan) + " : " + list[asal].getJarak(i) + " m");
                return;
            }
        }
        System.out.println("Tidak ada jarak antar gedung " + (char) ('A' + asal) + " dan gedung " + (char) ('A' + tujuan));
    }

    public void updateJarak(int asal, int tujuan, int jarakBaru) throws Exception {
        list[asal].jarak(tujuan, jarakBaru);
    }

    public int hitungEdge() {
        int jmlEdge = 0;
        for (int i = 0; i < vertex; i++) {
            jmlEdge += list[i].size();
        }
        return jmlEdge;
    }
}
