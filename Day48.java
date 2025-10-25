package Day48;

import java.util.Scanner;

public class Main48 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Membuat kalkulator menggunakan switch-case
        System.out.println("====== Kalkulator ======");
        System.out.print("1. Masukkan angka: ");
        double angka1 = p.nextDouble();
        System.out.print("Pilih operator: \n1. +\n2. -\n3. *\n4. /\n5. %\nMasukkan: ");
        int operator = p.nextInt();
        System.out.print("2. Masukkan angka: ");
        double angka2 = p.nextDouble();

        double hasil;

        switch (operator) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil = " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil = " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil = " + hasil);
                break;
            case 4:
                hasil = angka1 / angka2;
                System.out.println("Hasil = " + hasil);
                break;
            case 5:
                hasil = angka1 % angka2;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("Tidak ada dalam pilihan operator");
        }
    }

}
