package Day28;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Operator Perbandingan == dan !=
        System.out.print("masukkan a: ");
        int a = p.nextInt();

        System.out.print("masukkan b: ");
        int b = p.nextInt();

        boolean hasil1 = (a == b);
        boolean hasil2 = (a != b);

        System.out.println("hasil sama dengan: " + hasil1);
        System.out.println("hasil tidak sama dengan: " + hasil2);
    }

}
