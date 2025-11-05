package Day59;

import java.util.Scanner;

public class Main59 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //mencetak angka ganjil 1-N dan angka genap 1-N

        System.out.print("masukkan angka N : ");
        int N = p.nextInt();

        System.out.println("Angka Genap  : ");
        for (int i = 2; i <= N; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\nAngka Ganjil : ");
        for (int i = 1; i <= N; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
