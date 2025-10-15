package Day38;

import java.util.Scanner;

public class Main38 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Menentukan bilangan negatif, positif dan nol
        System.out.print("Masukkan angka: ");
        int angka = p.nextInt();
        System.out.println("=== Menentukan bilangan negatif, positif dan nol ===");

        if (angka > 0) {
            System.out.println("BILANGAN POSITIF");
            System.out.println("=== Menentukan ukuran bilangan ===");

            if (angka < 10) {
                System.out.println("BILANGAN KECIL");
            } else if (angka <= 100) {
                System.out.println("BILANGAN SEDANG");
            } else {
                System.out.println("BILANGAN BESAR");
            }

        } else if (angka < 0) {
            System.out.println("BILANGAN NEGATIF");

            if (angka > -10) {
                System.out.println("=== Menentukan ukuran bilangan ===");
                System.out.println("BILANGAN KECIL (mendekati nol)");
            } else if (angka >= -100) {
                System.out.println("BILANGAN SEDANG");
            } else {
                System.out.println("BILANGAN BESAR (jauh dari nol)");
            }

        } else {
            System.out.println("BILANGAN NOL");
        }
    }

}
