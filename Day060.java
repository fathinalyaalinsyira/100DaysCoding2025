package Day60;

import java.util.Scanner;

public class Main60 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //mencetak angka ganjil N-1 dan angka genap N-1

        System.out.print("masukkan angka N : ");
        int N = p.nextInt();

        System.out.println("Angka Genap  : ");
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nAngka Ganjil : ");
        for (int i = N; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
