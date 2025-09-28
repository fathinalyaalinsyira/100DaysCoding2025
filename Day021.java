package Day21;

public class Main {

    public static void main(String[] args) {

        //Latihan: Program untuk menukar nilai dua variabel
        //sebelum menukar
        int a = 5;
        int b = 10;
        System.out.println("sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //menukar
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("setelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("======BATAS======");

        //sebelum menukar
        int a1 = 6;
        int b1 = 11;
        System.out.println("sebelum ditukar: ");
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);

        //cara menukar 2
        int c1 = a1;
        a1 = b1;
        b1 = c1;
        System.out.println("setelah ditukar: ");
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);

    }
}
