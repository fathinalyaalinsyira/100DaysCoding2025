package Day58;

import java.util.Scanner;

public class Main58 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //mencetak angka 1-N dan angka N-1

        System.out.print("masukkan nilai N : ");
        int N = p.nextInt();

        System.out.print("\nangka 1 ke " + N + " : ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nangka " + N + " ke 1 : ");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
