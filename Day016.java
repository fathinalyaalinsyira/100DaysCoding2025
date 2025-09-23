package Day016;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        //Operator Aritmatika Perkalian (*) dan Pembagian (/).
        
        System.out.print("Masukkan Nilai a1 : ");
        int a1 = p.nextInt();
        
        System.out.print("Masukkan Nilai a2 : ");
        int a2 = p.nextInt();
        
        //mencetak perkalian
        int Hasil1 = a1 * a2;
        System.out.println("Hasil perkalian: " + Hasil1);
        
        //mencetak pembagian
        int Hasil2 = a1 / a2;
        System.out.println("Hasil Pembagian: " + Hasil2);
        
    }
}
