package Day53;

import java.util.Scanner; 

public class Main53 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //keyword break

        System.out.print("Masukkan angka pertama: ");
        int angka = p.nextInt();
        System.out.print("Masukkan batas: ");
        int batas = p.nextInt();

        for (int i = angka; i < batas; i++) {
            if (i == batas) {
                break;
            }
            System.out.println("Perulangan ke- " + i);
        }
        System.out.println("Perulangan berhenti");
    }

}
