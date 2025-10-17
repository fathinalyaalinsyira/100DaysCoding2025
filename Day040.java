package Day40;

import java.util.Scanner;

public class Main40 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Membuat Kalukalor menggunakan if
        System.out.println("====== KALKULATOR ======");
        System.out.print("Angka Pertama: ");
        double angka1 = p.nextDouble();

        System.out.print("Angka Selanjutnya: ");
        double angka2 = p.nextDouble();

        System.out.println("======OPERASI======");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. %");
        System.out.print("Masukkan Pilihan 1-5: ");
        int pilih = p.nextInt();

        System.out.println("======MENGHITUNG======");

        if (pilih == 1) {
            System.out.println("Hasil: " + (angka1 + angka2));
        } else if (pilih == 2) {
            System.out.println("Hasil: " + (angka1 - angka2));
        } else if (pilih == 3) {
            System.out.println("Hasil: " + (angka1 * angka2));
        } else if (pilih == 4) {
            System.out.println("Hasil: " + (angka1 / angka2));
        } else if (pilih == 5) {
            System.out.println("Hasil: " + (angka1 % angka2));

            if (angka2 != 0) {
                System.out.println("Hasil: " + (angka1 / angka2));
            } else {
                System.out.println("Error: Tidak bisa dibagi dengan nol!");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }

    }

}
