package Day72;

import java.util.Scanner;

public class Main72 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //membuat pola segi tiga siku siku terbalik

        System.out.print("masukkan tinggi : ");
        int tinggi = p.nextInt();

        for (int i = tinggi; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" o ");
            }
            System.out.println();
        }
    }
}
