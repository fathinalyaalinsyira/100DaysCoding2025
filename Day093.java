package Day93;

import java.util.Scanner;

public class Main93 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        //method cell(), floor(), dan round

        System.out.print("masukkan angka : ");
        double a = p.nextDouble();

        double ceil = Math.ceil(a);
        double floor = Math.floor(a);
        long round = Math.round(a);

        System.out.println("angka = " + a);
        System.out.println("ceil  = " + ceil);
        System.out.println("floor = " + floor);
        System.out.println("round = " + round);
    }

}
