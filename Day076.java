package Day76;

import java.util.Scanner;

public class Main76 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //methode string untuk pengecekan (equals(), equalIgnoreCase(), contains(), isEmpty()).

        System.out.println("1. masukkan pesan : ");
        String a = p.nextLine();
        System.out.println("2. masukkan pesan : ");
        String b = p.nextLine();
        System.out.println();

        //equals() : membandingkan, huruf besar/kecil berpengaruh
        if (a.equals(b)) {
            System.out.println("===equals===");
            System.out.println("pesan 1 = pesan 2");
            System.out.println();
        } else {
            System.out.println("===equals===");
            System.out.println("pesan 1 != pesan 2");
            System.out.println();
        }

        //equalIgnoreCase() : membandingkan, huruf besar/kecil tidak berpengaruh
        if (a.equalsIgnoreCase(b)) {
            System.out.println("===equalsIgnoreCase===");
            System.out.println("pesan 1 = pesan 2");
            System.out.println();
        } else {
            System.out.println("===equalsIgnoreCase===");
            System.out.println("pesan 1 != pesan 2");
            System.out.println();
        }

        //contains() : mengecek apakah pesan 1 mengandung pesan 2
        if (a.contains(b)) {
            System.out.println("===contains()===");
            System.out.println("pesan 1 MENGANDUNG pesan 2");
            System.out.println();
        } else {
            System.out.println("===contains()===");
            System.out.println("pesan 1 TIDAK MENGANDUNG pesan 2");
            System.out.println();
        }

        //isEmpty() : mengecek apakah teks kosong
        if (a.isEmpty()) {
            System.out.println("===isEmpty()===");
            System.out.println("pesan 1 kosong");
            System.out.println();
        } else {
            System.out.println("===isEmpty()===");
            System.out.println("pesan 1 tidak kosong");
            System.out.println();
        }

        if (b.isEmpty()) {
            System.out.println("===isEmpty()===");
            System.out.println("pesan 2 kosong");
            System.out.println();
        } else {
            System.out.println("===isEmpty()===");
            System.out.println("pesan 2 tidak kosong");
            System.out.println();
        }
    }
}
