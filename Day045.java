package Day45;

import java.util.Scanner;

public class Main45 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        //Percabangan (switch-case)
        System.out.print("Masukkan apakah saya lulus: ");
        boolean angka = p.nextBoolean();

        switch (Boolean.toString(angka)) {
            case "true":
                System.out.println("LULUS");
                break;
            case "false":
                System.out.println("TIDAK");
                break;
            default:
                System.out.println("ini angka berikutnya");
        }
    }

}

