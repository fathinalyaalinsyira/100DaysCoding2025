package Day37;

import java.util.Scanner;

public class Main37 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Menentukan bilangan ganjil atau genap
        System.out.print("Masukkan angka: ");
        int angka = p.nextInt();

        if (angka % 2 == 0) {
            System.out.println("======Menentukan Ganjil Genap======");
            System.out.println("ANGKA GENAP");
        } else {
            System.out.println("ANGKA GANJIL");

            if (angka % 3 == 0 && angka % 5 == 0) {
                System.out.println("======Menentukan Kategori======");
                System.out.println("MASTER CLASS");
            } else if (angka % 3 == 0) {
                System.out.println("PRIDE OF 3");
            } else if (angka % 5 == 0) {
                System.out.println("PRIDE OF 5");
            } else {
                System.out.println("ANGKA GANJIL BIASA");
            }
        }
    }

}
