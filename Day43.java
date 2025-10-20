package Day43;

import java.util.Scanner;

public class Main43 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Program kelipatan 3, 5, 3, dan 5
        System.out.println("Masukkan angka: ");
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
                jenis = " genap";
            } else {
                jenis = " ganjil";
            }

            if (angka % 3 == 0 && angka % 5 == 0) {
                habis = " dibagi 3 dan 5";
            } else if (angka % 3 == 0) {
                habis = " dibagi 3";
            } else if (angka % 5 == 0) {
                habis = " dibagi 5";
            }
        } else {
            System.out.println("tidak boleh dibagi 0");
        }
        System.out.println(angka + " adalah angka " + satuan + jenis + " yang bisa" + habis);
    }

}
