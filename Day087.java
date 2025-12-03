package Day87;

import java.util.Arrays;
import java.util.Scanner;

public class Main87 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //mencari elemen pada array

        String[] angka = {"fatin", "serli", "rusmi", "samra"};
        System.out.println(Arrays.toString(angka));

        System.out.print("Masukkan nama: ");
        String nama = p.nextLine();

        boolean a = false;

        for (int i = 0; i < angka.length; i++) {
            if (nama.equalsIgnoreCase(angka[i])) {
                System.out.println(nama + " adalah index ke- " + i);
                a = true;
                break;
            }
        }
        if (!a) {
            System.out.println("nama tidak termasuk!");
        }
    }

}
