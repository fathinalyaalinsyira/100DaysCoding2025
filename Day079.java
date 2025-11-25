package Day79;

import java.util.Scanner;

public class Main79 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //membuat akun dan login ke akun (menggunakan loop berhenti ketika user dan pwnya benar)

        System.out.println("=== BUAT ===");
        System.out.print("Masukkan Username: ");
        String user = p.nextLine();
        System.out.print("Masukkan Password: ");
        int sandi = p.nextInt();
        p.nextLine();

        while (true) {
            System.out.println("=== Login ===");

            System.out.print("Username: ");
            String nama = p.nextLine();

            System.out.print("Password: ");
            int pass = p.nextInt();
            p.nextLine();

            if (nama.equalsIgnoreCase(user) && pass == sandi) {
                System.out.println("\nANDA BERHASIL LOGIN!!");
                break;
            } else {
                System.out.println("Username atau password salah! Coba lagi.\n");
            }
        }
    }

}
