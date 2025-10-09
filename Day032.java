package Day32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Operator Logika  OR (||)
        System.out.print("memiliki tiket: ");
        boolean tiket = sc.nextBoolean();

        System.out.print("memiliki member: ");
        boolean member = sc.nextBoolean();

        //hasil
        boolean hasil = tiket || member;

        System.out.println("\njika memiliki salah satunya maka tetap bisa masuk");
        System.out.println("bisa masuk: " + hasil);
    }
    
}
