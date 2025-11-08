package Day62;

import java.util.Scanner;

public class Main62 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //menjumlahkan 1-N

        System.out.print("masukkan angka N : ");
        int N = p.nextInt();

        int hasil = 0;

        for (int i = 1; i <= N; i++) {
            hasil += i;
        }
        System.out.println("jumlah dari 1 sampai " + N + " yaitu : " + hasil);
    }
}
