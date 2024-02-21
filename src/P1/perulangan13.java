package P1;

import java.util.Scanner;

public class perulangan13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        String nim = input13.nextLine();

        int jmlNim = Integer.parseInt(nim.substring(nim.length() - 2));

        if (jmlNim < 10) {
            jmlNim += 10;
        }

        System.out.println("maka n =" + jmlNim);

        for (int i = 1; i < jmlNim; i++) {
            if (i != 6 && i != 10 ) {
                if (i %2 == 0) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
        }
    }
}
