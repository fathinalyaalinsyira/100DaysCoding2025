package Day71;

import java.util.Scanner;

public class Main71 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //membuat pola segi tiga siku siku

        System.out.print("masukkan tinggi : ");
        int tinggi = p.nextInt();

        for (int i = 0; i <= tinggi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" o ");
            }
            System.out.println();
        }
    }
}
