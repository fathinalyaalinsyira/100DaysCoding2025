package Day66;

import java.util.Scanner;

public class Main66 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //membuat pola vertikal

        System.out.print("masukkan angka : ");
        int a = p.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("o");
        }
    }
}
