package Day73;

import java.util.Scanner;

public class Main73 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //penjumlahan angka (berhenti ketika menginputkan angka negatif)

        int j = 0;
        int a;

        do {
            System.out.print("masukkan angka : ");
            a = p.nextInt();

            if (a >= 0) {
                j += a;
            }

        } while (a >= 0);
        System.out.println("===================");
        System.out.println("hasil penjumlahan : " + j);
    }
}
