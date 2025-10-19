package Day42;

import java.util.Scanner;

public class Main42 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Menentukan gaji bersih
        System.out.print("Nama Pegawai: ");
        String nama = p.nextLine();

        System.out.println("====== Pekerjaan ======");
        System.out.println("1. PNS \n2. Freelancer");
        System.out.println("========================");
        System.out.print("Pilih pekerjaan: ");
        int pilih = p.nextInt();

        System.out.print("Penghasilan: ");
        int gaji = p.nextInt();

        String kerja = "";
        int pajak = 0;
        double potongan = 0;

        if (pilih == 1) {
            kerja = "PNS";
            if (gaji >= 5000000) {
                pajak = 15;
            } else if (gaji >= 3000000 && gaji < 5000000) {
                pajak = 10;
            } else {
                pajak = 0;
            }
        } else if (pilih == 2) {
            kerja = "Freelancer";
            if (gaji >= 5000000) {
                pajak = 8;
            } else if (gaji >= 3000000 && gaji < 5000000) {
                pajak = 3;
            } else {
                pajak = 0;
            }
        } else {
            System.out.println("PILIHAN TIDAK TERSEDIA");
        }

        potongan = gaji * pajak / 100.0;
        double hasil = gaji - potongan;

        System.out.println("=============================");
        System.out.println("Nama Pegawai\t\t: " + nama);
        System.out.println("Jenis Pekerjaan\t\t: " + kerja);
        System.out.println("Penghasilan Kotor\t:" + "Rp" + gaji);
        System.out.println("Pajak Dikenakan\t\t:" + pajak + "%");
        System.out.println("Potongan\t\t\t:" + "Rp" + potongan);
        System.out.println("Penghasilan Bersih\t:" + "Rp" + hasil);

    }

}
