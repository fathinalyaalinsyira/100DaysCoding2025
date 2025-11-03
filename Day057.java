package Day57;

import java.util.Scanner;

public class Main57 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //nasted loop

        System.out.print("Masukkan nilai kesamping: ");
        int samping = p.nextInt();

        System.out.print("Masukkan nilai kebawah: ");
        int bawah = p.nextInt();

        for (int i = 0; i < bawah; i++) {
            for (int j = 0; j <= samping; j++) {
                System.out.print("o");
            }
            System.out.println("o");
        }
        System.out.println("");
    }
}
