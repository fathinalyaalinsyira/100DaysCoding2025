package Day64;

import java.util.Scanner;

public class Main64 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //mencetak hasil M pangkat N

        System.out.print("masukkan M : ");
        int M = p.nextInt();

        System.out.print("masukkan N : ");
        int N = p.nextInt();

        int hasil = 1;
        for (int i = 1; i <= N; i++) {
            hasil *= M;
        }
        System.out.println(M + " pangkat " + N + " = " + hasil);
    }
}
