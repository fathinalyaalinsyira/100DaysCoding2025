package Day015;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        //Operator Aritmatika Penjumlahan (+) dan Pengurangan (-).
        
        System.out.print("Masukkan Nilai a1 : ");
        int a1 = p.nextInt();
        
        System.out.print("Masukkan Nilai a2 : ");
        int a2 = p.nextInt();
        
        //mencetak penjumlahan
        int Hasil1 = a1 + a2;
        System.out.println("Hasil Jumlah: " + Hasil1);
        
        //mencetak pengurangan
        int Hasil2 = a1 - a2;
        System.out.println("Hasil Pengurangan: " + Hasil2);
        
    }
}
