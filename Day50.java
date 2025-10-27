package Day50;

import java.util.Scanner;

public class Main50 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //Membuat program ganjil genap menggunakan ternary

        System.out.print("Masukkan angka: ");
        int angka = p.nextInt();

        String hasil = angka % 2 == 0 ? "GENAP" : "GANJIL";

        System.out.println("Angka: " + angka + "\nStatus: " + hasil);
    }

}
