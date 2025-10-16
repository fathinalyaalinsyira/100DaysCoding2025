package Day39;

import java.util.Scanner;

public class Main39 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //membuat menu menggunakan if
        System.out.println("====== SUDUT CAFE MENU ======");
        System.out.println("1. Cappucino");
        System.out.println("2. Choco Cream");
        System.out.println("3. Chocolatos");
        System.out.println("4. Choco Milk");
        System.out.println("======PILIHAN MENU======");
        System.out.print("PILIH MENU: ");
        int pilih = p.nextInt();
        System.out.println("======PILIHAN ANDA======");

        if (pilih == 1) {
            System.out.println("CAPPUCINO");
            System.out.println("Harga: 15.000");
        } else if (pilih == 2) {
            System.out.println("CHOCO CREAM");
            System.out.println("Harga: 16.000");
        } else if (pilih == 3) {
            System.out.println("CHOCOLATOS");
            System.out.println("Harga: 10.000");
        } else if (pilih == 4) {
            System.out.println("CHOCO MILK");
            System.out.println("Harga: 17.000");
        } else {
            System.out.println("PILIHAN TIDAK VALID");
        }

    }

}
