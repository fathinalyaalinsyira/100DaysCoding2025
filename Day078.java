package Day78;

import java.util.Scanner;

public class Main78 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //menggunakan berbagai methode string

        String nama = "Fathin Al'ya Al'Insyira ";
        System.out.println(nama);
        System.out.println();

        //untuk perbandingan equals & equalIgnoreCase
        String nama1 = "fathin al'ya al'insyira";
        String nama2 = "FATHIN AL'YA AL'INSYIRA";

        //1. methode string dasar
        //length()
        int panjang = nama.length();

        //toUpperCase
        String besar = nama.toUpperCase();

        //toLowerCase
        String kecil = nama.toLowerCase();

        //2. methode string untuk manipulasi
        //substring()
        String sub = nama.substring(0, 6);

        //replace()
        String replace = nama.replace("Al'ya Al'Insyira", "Cantik dan Baik");

        //trim()
        String trim = nama.trim();

        //3. methode string untuk pengecekan
        System.out.println("====================");
        System.out.println("contains              : " + nama.contains("Fathin"));
        System.out.println("equals()              : " + nama1.equals(nama2));
        System.out.println("equalsIgnoreCase()    : " + nama1.equalsIgnoreCase(nama2));
        System.out.println("isEmpty()             : " + nama.isEmpty());

        System.out.println();

        System.out.println("====================");
        System.out.println("length                : " + panjang);
        System.out.println("UPPER                 : " + besar);
        System.out.println("lower                 : " + kecil);
        System.out.println("Substring             : " + sub);
        System.out.println("Replace               : " + replace);
        System.out.println("Trim                  : " + trim.length());
    }

}
