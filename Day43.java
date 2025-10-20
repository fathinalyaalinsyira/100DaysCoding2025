package Day43;

import java.util.Scanner;

public class Main43 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Program kelipatan 3, 5, 3, dan 5
        System.out.print("Masukkan angka: ");
        int angka = p.nextInt();

        String satuan = "";
        String jenis = "";
        String habis = "";

        if (angka > 0) {
            if (angka > 0 && angka < 10) {
                satuan = "satuan";
            } else if (angka >= 10 && angka < 100) {
                satuan = "puluhan";
            } else if (angka >= 100 && angka < 1000) {
                satuan = "ratusan";
            }

            if (angka % 2 == 0) {
                jenis = " ganjil";
            } else {
                jenis = " genap";
            }

            if (angka % 3 == 0 && angka % 5 == 0) {
                habis = "bisa dibagi 3 dan 5";
            } else if (angka % 3 == 0) {
                habis = "bisa dibagi 3";
            } else if (angka % 5 == 0) {
                habis = " bisa dibagi 5";
            } else {
                habis = "tidak bisa dibagi 3 dan 5";
            }
            System.out.println(angka + " adalah angka " + satuan + jenis + " yang " + habis);
        } else {
            System.out.println("jangan masukkan angka negatif atau 0(nol)");
        }
    }

}
