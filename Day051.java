package Day51;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalHarga = 0;
        int jumlahBarang = 3; 

        System.out.println("=== Program Kasir Menggunakan For dan Switch ===");

        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.println("\nBarang ke-" + i);
            System.out.println("1. Pensil  - Rp2.000");
            System.out.println("2. Buku    - Rp5.000");
            System.out.println("3. Penghapus - Rp1.500");
            System.out.print("Masukkan kode barang (1-3): ");
            int kode = input.nextInt();

            int harga = 0;
            switch (kode) {
                case 1:
                    harga = 2000;
                    System.out.println("Anda memilih Pensil");
                    break;
                case 2:
                    harga = 5000;
                    System.out.println("Anda memilih Buku");
                    break;
                case 3:
                    harga = 1500;
                    System.out.println("Anda memilih Penghapus");
                    break;
                default:
                    System.out.println("Kode tidak valid, dianggap Rp0");
                    break;
            }

            System.out.print("Masukkan jumlah: ");
            int jumlah = input.nextInt();

            int subtotal = harga * jumlah;
            totalHarga += subtotal;

            System.out.println("Subtotal: Rp" + subtotal);
        }

        System.out.println("\n=== Total Harga Semua Barang ===");
        System.out.println("Total yang harus dibayar: Rp" + totalHarga);
    }
}
