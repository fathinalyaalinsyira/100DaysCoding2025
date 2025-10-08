package Day31;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        //Operator Logika  AND (&&)
        System.out.print("masukkan a: ");
        int a = p.nextInt();

        System.out.print("masukkan b: ");
        int b = p.nextInt();

        //kondisi 1
        boolean hasil1 = (a <= b);
        //kondisi 2
        boolean hasil2 = (a >= b);

        //hasil
        boolean hasilAkhir = hasil1 && hasil2;

        System.out.println("hasil <=: " + hasil1);
        System.out.println("hasil >=: " + hasil2);
        System.out.println("hasil akhir: " + hasilAkhir);
    }

}
