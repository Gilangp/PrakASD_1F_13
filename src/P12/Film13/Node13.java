package P12.Film13;

public class Node13 {
    DaftarFilm13 dataFilm;
    Node13 prev, next;


    public Node13(Node13 prev, DaftarFilm13 dataFilm, Node13 next) {
        this.prev = prev;
        this.dataFilm = dataFilm;
        this.next = next;
    }
}
