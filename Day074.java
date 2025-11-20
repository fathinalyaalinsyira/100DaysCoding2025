package Day74;

import java.util.Scanner;

public class Main74 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //do While : membuat menu berulang

        int pilih;

        do {
            System.out.println("====== PILIHAN =====");
            System.out.println("1. Pesan");
            System.out.println("2. Kesan");
            System.out.println("3. Saran");
            System.out.println("4. Berhenti");
            System.out.print("Pilih : ");
            pilih = p.nextInt();
            System.out.println();

            switch (pilih) {
                case 1:
                    System.out.println("=== PESAN ===");
                    System.out.println("Terimakasih sudah sabar membimbing kak :)\nMaaf karna terlalu lemot:(");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("=== KESAN ===");
                    System.out.println("Saya mendapatkan ilmu dan pengetahuan baru");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("=== SARAN ===");
                    System.out.println("Jangan sering sering meroasting kak:(");
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Program Berhenti!!!");
                    System.out.println();
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    System.out.println();
            }

        } while (pilih != 4);
    }
}
