package Day75;

import java.util.Scanner;

public class Main75 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //methode string dasar (length(), toUpperCase(), toLowerCase()).

        System.out.print("Masukkan sebuah teks: ");
        String teks = p.nextLine();

        int panjang = teks.length();

        String besar = teks.toUpperCase();

        String kecil = teks.toLowerCase();

        System.out.println("\n=== HASIL ===");
        System.out.println("Panjang string        : " + panjang);
        System.out.println("Huruf besar (UPPER)   : " + besar);
        System.out.println("Huruf kecil (lower)   : " + kecil);
    }
}
