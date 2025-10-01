package Day24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Latihan : Program Luas Lingkaran 
        final double phi = 3.14;
        System.out.print("Masukkan jari-jari lingkaran: ");
        int r = p.nextInt();

        // rumus luas = π(phi) * r * r
        double luas = phi * r * r;

        // mencetak hasil
        System.out.println("Luas lingkaran adalah: " + luas);
    }
}
