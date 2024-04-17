package P8;

public class StackKonversi13 {
    int size;
    int[] tumpukanBiner;
    int top;

    public StackKonversi13() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if (isEmty()) {
            System.out.println("Stack kososng");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
