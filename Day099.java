package Day99;

import java.util.Scanner;

public class Main99 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //Deretan bilangan prima dari 1-N

        System.out.print("masukkan angka n : ");
        int n = p.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean pm = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    pm = false;
                    break;
                }
            }
            if (pm) {
                System.out.println(i);
            }
        }
    }

}  apakah ini sdhbnr
