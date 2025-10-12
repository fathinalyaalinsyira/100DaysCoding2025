package Day35;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Percabangan
        System.out.print("masukkan nilai: ");
        int nilai = p.nextInt();

        if (nilai >= 80) {
            System.out.println("A");
        } else if (nilai >= 70 && nilai < 80) {
            System.out.println("B");
        } else if (nilai >= 50 && nilai < 70) {
            System.out.println("C");
        } else {
            System.out.println("ERROR");
        }
    }
}
