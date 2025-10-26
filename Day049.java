package Day49;

import java.util.Scanner;

public class Main49 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //Operator Ternary

        System.out.print("Masukkan nama: ");
        String nama = p.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = p.nextInt();

        String status = (umur >= 19) ? "DEWASA" : "BOCIL";

        System.out.println("====== KETERANGAN ======");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Status: " + status);
    }

}
