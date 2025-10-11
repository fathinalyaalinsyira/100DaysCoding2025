package Day34;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //Latihan mengkombinasikan berbagai operator    

        System.out.print("masukkan a: ");
        int a = p.nextInt();

        System.out.print("masukkan b: ");
        int b = p.nextInt();

        System.out.print("masukkan c: ");
        int c = p.nextInt();

        int hasil = b * c;
        a = a + hasil;

        System.out.println("nilai akhir a = " + a);

        boolean hasilAkhir = (a % 2 == 0 && a / b > c || a - b <= 10);

        System.out.println("hasil logika = " + hasilAkhir);

    }

}
