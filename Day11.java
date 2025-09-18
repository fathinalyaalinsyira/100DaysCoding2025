package Day11;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        //Scanner tipe data String
        System.out.print("nama: ");
        String nama = input.nextLine();
        
        //Scanner tipe data Char
        System.out.print("kelas: ");
        char kelas = input.next().charAt(0);
        
        //Scanner tipe data Integer
        System.out.print("umur: ");
        int Umur = input.nextInt();
        
        //Scanner tipe data Double
        System.out.print("Tinggi: ");
        double Tinggi = input.nextDouble();
        
        //Scanner tipe data Float
        System.out.print("Berat: ");
        float Berat = input.nextFloat();
        
        //Scanner tipe data Long
        System.out.print("Panjang: ");
        long panjang = input.nextLong();
        
        //Scanner tipe data Short
        System.out.print("Sedang: ");
        short Sedang = input.nextShort();
        
        //Scanner tipe data Byte
        System.out.print("Pendek: ");
        byte pendek = input.nextByte();
        
        //Scanner tipe data Boolean
        System.out.print("Lulus: ");
        boolean Lulus = input.nextBoolean();
        
        
        System.out.println("Nama saya: "+nama);
        System.out.println("Kelas saya: "+kelas);
        System.out.println("Umur saya: "+Umur);
        System.out.println("Tinggi saya: "+Tinggi);
        System.out.println("Berat badan saya: "+Berat);
        System.out.println("Panjang: "+panjang);
        System.out.println("Sedang: "+Sedang);
        System.out.println("Pendek: "+pendek);
        System.out.println("Lulus: "+Lulus);
        
        //Penjelasan mengenai Scanner
        /* Scanner digunakan untuk membaca input dari pengguna (keyboard) atau sumber lain seperti file.
        *Scanner adalah bagian dari paket java.util, sehingga perlu diimpor sebelum digunakan.
        */
    }
}
