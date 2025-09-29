package Day22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        //Latihan : Program Luas Persegi
        
        System.out.print("Masukkan sisi: ");
        double sisi = p.nextDouble();

        //hitung luas
        double luas = sisi * sisi;
        System.out.println("Luas persegi: " + luas);
    }
}
