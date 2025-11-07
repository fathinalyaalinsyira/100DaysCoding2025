package Day61;

import java.util.Scanner;

public class Main61 {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        //mencetak bilangan kelipatan M dari 1-N
        
        System.out.print("masukkan nilai N : ");
        int N = p.nextInt();
        System.out.print("masukkan kelipatan M : ");
        int M = p.nextInt();
        
        System.out.println("\nkelipatan : "+ M +" dari 1 sampai "+ N);
        for (int i = 1; i <= N; i++) {
            if (i % M ==0) {
                System.out.print(i +" ");
            }
        }
            System.out.println();
    }
}
