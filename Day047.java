package Day47;

import java.util.Scanner;

public class Main47 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Program menentukan hari
        System.out.print("Masukkan angka untuk hari: ");
        int hari = p.nextInt();

        switch (hari) {
            case 1:
                System.out.println("HARI SENIN");
                break;
            case 2:
                System.out.println("HARI SELASA");
                break;
            case 3:
                System.out.println("HARI RABU");
                break;
            case 4:
                System.out.println("HARI KAMIS");
                break;
            case 5:
                System.out.println("HARI JUM'AT");
                break;
            case 6:
                System.out.println("HARI SABTU");
                break;
            case 7:
                System.out.println("HARI MINGGU");
                break;
            default:
                System.out.println("HARI TIDAK ADA");
        }
    }

}
