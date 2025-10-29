package Day52;

import java.util.Scanner;

public class Main52 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Perulangan while
        System.out.print("Masukkan angka: ");
        int i = p.nextInt();

        while (i <= 10) {
            System.out.println("Perulangan ke- " + i);
            i++;
        }
        System.out.println("angka lebih dari 10");
    }

}
