package P14.Praktikum2;

public class BinaryTreeArrayMain13 {
    public static void main(String[] args) {
        BinaryTreeArray13 bta = new BinaryTreeArray13();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

        System.out.print("PreOrder Traversal : ");
        bta.traversePreOrder(0);
        System.out.println("\n");

        System.out.print("PostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.println("\n");
        
        System.out.print("Add 10 to tree : ");
        bta.add(10);
        bta.traverseInOrder(0);
        System.out.println("\n");
    }
}
