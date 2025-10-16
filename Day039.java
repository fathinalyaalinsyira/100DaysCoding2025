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

        if (pilih >= 1 && pilih <= 4) {
            if (pilih == 1) {
                System.out.println("Menu: CAPPUCINO");
            } else if (pilih == 2) {
                System.out.println("Menu: CHOCO CREAM");
            } else if (pilih == 3) {
                System.out.println("Menu: CHOCOLATOS");
            } else {
                System.out.println("Menu: CHOCO MILK");
            }

            if (pilih == 1) {
                System.out.println("Harga: 15.000");
            } else if (pilih == 2) {
                System.out.println("Harga: 16.000");
            } else if (pilih == 3) {
                System.out.println("Harga: 10.000");
            } else {
                System.out.println("Harga: 17.000");
            }

        } else {
            System.out.println("PILIHAN TIDAK ADA DI DAFTAR");
        }
    }

}
