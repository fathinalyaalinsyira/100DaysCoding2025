package Day100;

import java.util.Scanner;

public class Main100 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //String Cantik ISC

        String a = p.nextLine();

        int I = -1;
        int S = -1;
        int C = -1;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'I') {
                I = i;
                break;
            }
        }

        if (I != -1) {
            for (int i = I + 1; i < a.length(); i++) {
                if (a.charAt(i) == 'S') {
                    S = i;
                    break;
                }
            }
        }

        if (S != -1) {
            for (int i = S + 1; i < a.length(); i++) {
                if (a.charAt(i) == 'C') {
                    C = i;
                    break;
                }
            }
        }

        if (I != -1 && S != -1 && C != -1) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
}
