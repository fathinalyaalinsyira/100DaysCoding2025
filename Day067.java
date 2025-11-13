package Day67;

import java.util.Scanner;

public class Main67 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //membuat pola horizontal

        System.out.print("masukkan angka : ");
        int a = p.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.print("o ");
        }
        System.out.println();
    }
}
