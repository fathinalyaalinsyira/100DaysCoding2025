package Day44;

import java.util.Scanner;

public class Main44 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //Program predikat nilai (A, B, C, D, E)

        System.out.println("Masukkan nilai: ");
        int nilai = p.nextInt();

        if (nilai >= 0 && nilai <= 100) { 
            if (nilai >= 90) {
                System.out.println("Nilai A");
                System.out.println("WOW NILAI ANDA SANGAT KEREN");
            } else if (nilai >= 80 && nilai <= 90) {
                System.out.println("Nilai B");
                System.out.println("WOW NILAI ANDA KEREN");
            } else if (nilai >= 70 && nilai <= 80) {
                System.out.println("Nilai C");
                System.out.println("NILAI ANDA CUKUP KEREN");
            } else if (nilai >= 60 && nilai <= 70) {
                System.out.println("Nilai D");
                System.out.println("NILAI ANDA KURANG KEREN");
            } else {
                System.out.println("NILAI ANDA KOK GITU");
            }
        } else {
            System.out.println("TIDAK ADA NILAI TERPILIH");
        }
    }

}
