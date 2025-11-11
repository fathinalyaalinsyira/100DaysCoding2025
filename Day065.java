package Day65;

import java.util.Scanner;

public class Main65 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //membuat bilangan faktorial

        System.out.print("masukkan bilangan : ");
        int N = p.nextInt();

        long faktorial = 1;
        for (int i = 1; i <= N; i++) {
            faktorial *= i;
            System.out.print(i);
            if (i < N) {
                System.out.print(" x ");
            } else {
                System.out.print(" = ");
            }
        }
        System.out.println(faktorial);
        System.out.println("faktorial dari " + N + " adalah: " + faktorial);
    }
}
