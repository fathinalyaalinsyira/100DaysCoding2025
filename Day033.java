package Day33;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //Operator Logika  NOT (!)

        System.out.print("masukkan angka : ");
        int angka = p.nextInt();

        boolean asli = angka == 0;
        boolean not = !(angka == 0);

        System.out.println("jika angka yang dimasukkan 0 maka hasilnya akan true");
        System.out.println("hasil sebelum dibalikkan: " + asli);
        System.out.println("hasil setelah dibalikkan: " + not);

    }

}
