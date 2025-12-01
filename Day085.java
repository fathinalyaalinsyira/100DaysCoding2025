package Day85;

import java.util.Scanner;

public class Main85 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //menentukan angka maksimal array

        System.out.print("batas array: ");
        int ab = p.nextInt();

        int[] a = new int[ab];

        for (int i = 0; i < a.length; i++) {
            System.out.println(i);
        }
    }

}
