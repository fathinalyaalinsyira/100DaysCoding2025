package Day25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Operator Increment dan Decrement (++, --)
        System.out.print("masukkan angka: ");
        int angka = p.nextInt();

        System.out.println("Nilai awal: " + angka);

        // increment
        angka++;
        System.out.println("Setelah angka++ : " + angka);

        // decrement
        angka--;
        System.out.println("Setelah angka-- : " + angka);

        // pre-increment
        System.out.println("===pre-increment===");
        System.out.println("++angka : " + (++angka));
        System.out.println("--angka : " + (--angka));

        // post-increment
        System.out.println("===post-increment===");
        System.out.println("angka++ : " + (angka++));
        System.out.println("angka-- : " + (angka--));

        //nilai akhir
        System.out.println("Nilai akhir: " + angka);
    }

}
