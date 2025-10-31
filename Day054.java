package Day54;

import java.util.Scanner;

public class Main54 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //Keyword continue

        System.out.print("masukkan jumlah: ");
        int a = p.nextInt();

        int total = 0;
        int jumlahvalid = 0;
        int jumlahnonvalid = 0;
        int nilaikecil = 100;
        int nilaibesar = 0;

        for (int i = 1; i <= a; i++) {
            System.out.print("masukkan nilai: ");
            int nilai = p.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("nilai tidak valid dan tidak dapat di proses");
                jumlahnonvalid++;
                continue;
            }
            total += nilai;
            jumlahvalid++;

            if (nilai < nilaikecil) {
                nilaikecil = nilai;
            }
            if (nilai > nilaibesar) {
                nilaibesar = nilai;
            }
        }
        double ratarata = (double) total / jumlahvalid;

        System.out.println("====================");
        System.out.println("total nilai valid: " + total);
        System.out.println("jumlah nilai valid: " + jumlahvalid);
        System.out.println("total nilai tidak valid: " + jumlahnonvalid);
        System.out.println("nilai valid terkecil: " + nilaikecil);
        System.out.println("nilai valid terbesar: " + nilaibesar);
        System.out.println("rata-rata nilai valid: " + ratarata);

    }

}
