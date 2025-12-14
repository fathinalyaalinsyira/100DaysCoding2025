package Day98;

import java.util.Scanner;

public class Main98 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //deretan fibonacci dari 1-n

        System.out.print("masukkan n : ");
        int n = p.nextInt();

        int a = 1;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

}
