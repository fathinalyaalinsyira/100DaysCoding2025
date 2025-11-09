package Day63;

import java.util.Scanner;

public class Main63 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //mengalikan 1-N

        System.out.print("masukkan nilai N : ");
        int N = p.nextInt();

        long hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil *= i;
        }
        System.out.println("hasil mengalikan angka 1 sampai " + N + " yaitu : " + hasil);
    }
}
