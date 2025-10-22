package Day45;

import java.util.Scanner;

public class Main45 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Percabangan (switch-case)
        System.out.print("Masukkan angka: ");
        int angka = p.nextInt();

        switch (angka) {
            case 1:
                System.out.println("ini angka 1");
                break;
            case 2:
                System.out.println("ini angka 2");
                break;
            case 3:
                System.out.println("ini angka 3");
                break;
            default:
                System.out.println("ini angka berikutnya");
                break;
        }
    }

}
