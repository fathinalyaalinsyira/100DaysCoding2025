package Day26;

public class Main {

    public static void main(String[] args) {

        //Operator Penugasan (=, +=, -=, dll)
        
        int a1 = 10, a = 10, b = 10, c = 10, d = 10, e = 10;
        System.out.println("nilai awal: 10");

        //operator penugasan
        a1 = 5;
        a += 5;
        b -= 3;
        c *= 2;
        d /= 4;
        e %= 3;

        //mencetak
        System.out.println("Hasil =: " + a1);
        System.out.println("Hasil +=: " + a);
        System.out.println("Hasil -=: " + b);
        System.out.println("Hasil *=: " + c);
        System.out.println("Hasil /=: " + d);
        System.out.println("Hasil %=: " + e);
    }

}
