package Day36;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Nested if
        System.out.println("====== List Kendaraan ======");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Masukkan pilihan : ");
        int merk = p.nextInt();

        if (merk == 1) {
            System.out.println("1. Toyota Avanza" + "\n2. Honda Brio");
            System.out.print("Tentukan pilihan : ");
            merk = p.nextInt();
            System.out.println("\n===== Spesifikasi Kendaraan =====");
            if (merk == 1) {
                System.out.println("1. Jenis : Mobil" + "\n2. Merk & Tipe : Toyota Avanza" + "\n3. Mesin : 1500 cc");
            } else if (merk == 2) {
                System.out.println("1. Jenis : Mobil" + "\n2. Merk & Tipe : Honda Brio" + "\n3. Mesin : 1200 cc");
            } else {
                System.out.println("pilihan tidak ada");
            }
        } else if (merk == 2) {
            System.out.println("1. Yamaha NMAX" + "\n2. Honda Vario");
            System.out.print("Tentukan pilihan : ");
            merk = p.nextInt();
            System.out.println("\n====== Spesifikasi Kendaraan ======");
            if (merk == 1) {
                System.out.println("1. Jenis : Motor" + "\n2. Merk & Tipe : Yamaha NMAX" + "\n3. Mesin : 155 cc");
            } else if (merk == 2) {
                System.out.println("1. Jenis : Motor" + "\n2. Merk & Tipe : Honda Vario" + "\n3. Mesin : 150 cc");
            } else {
                System.out.println("pilihan tidak ada");
            }
        } else {
            System.out.println("pilihan tidak ditemukan");
        }
    }

}
