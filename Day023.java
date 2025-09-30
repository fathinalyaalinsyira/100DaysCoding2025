package Day23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner p = new Scanner (System.in);
        
        //Latihan : Program Luas Persegi Panjang
        System.out.print("Masukkan panjang: ");
        double a = p.nextDouble();
        System.out.print("Masukkan lebar: ");
        double b = p.nextDouble();
        double luas = a * b;
        System.out.println("Luas persegi panjang: " + luas);
    }
}
