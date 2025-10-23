package Day46;

import java.util.Scanner;

public class Main46 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        //Mmebuat menu menggunakan switch case
        System.out.println("===== SUDUT CAFE =====");
        System.out.println("1. Cappuccino");
        System.out.println("2. Matcha Latte");
        System.out.println("3. Es Coklat");
        System.out.println("4. Teh Lemon");
        System.out.println("=======================");
        System.out.print("Pilih minuman (1-4): ");
        int pilihan = p.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Cappuccino");
                break;
            case 2:
                System.out.println("Matcha Latte");
                break;
            case 3: 
                System.out.println("Es Coklat");
                break;
            case 4:
                System.out.println("Teh Lemon");
                break;
            default:
                System.out.println("Tidak tersedia");
        }
        System.out.println("PILIHAN TIDAK VALID");
    }

}
