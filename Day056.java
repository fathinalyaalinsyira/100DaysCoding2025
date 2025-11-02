package Day56;

import java.util.Scanner;

public class Main56 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //perulangan do-while
        String nama, asal, masuk;
        do {
            System.out.print("Masukkan nama  : ");
            nama = p.nextLine();
            System.out.print("Masukkan asal  : ");
            asal = p.nextLine();
            System.out.println("====== BIODATA ======");
            System.out.println("Nama saya " + nama + " saya berasal dari " + asal);
            System.out.println("==============================");
            System.out.print("Ulang ya / no: ");
            masuk = p.next();
            System.out.println("===============================");
            p.nextLine();
        } while (masuk.equalsIgnoreCase("ya"));
        System.out.println("PROGRAM SELESAI");
    }

}
