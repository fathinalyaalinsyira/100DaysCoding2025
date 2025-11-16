package Day70;

import java.util.Scanner;

public class Main70 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //membuat pola persegi panjang 

        System.out.print("Masukkan lebar: ");
        int lebar = p.nextInt();

        System.out.print("Masukkan panjang: ");
        int panjang = p.nextInt();

        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                if (lebar != panjang) {
                    System.out.print("o ");
                }
            }
            System.out.println();
        }
    }
}
