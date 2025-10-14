package Day37;

import java.util.Scanner;

public class Main37 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Menentukan bilangan ganjil atau genap
        System.out.print("Masukkan angka: ");
        int angka = p.nextInt();

        if (angka % 2 == 0) {
            System.out.println("GENAP");
        } else {
            System.out.println("GANJIL");
        }
    }

}
