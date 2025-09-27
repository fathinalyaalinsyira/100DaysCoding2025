package Day20;

public class Main {

    public static void main(String[] args) {

        //Mengubah Tipe Data Primitif menjadi String
        
        //cara 1
        int a = 123;
        String str = String.valueOf(a);
        System.out.println("hasil1= " +str);
        
        //cara 2
        int b = 123;
        String str1 = b + "" ;
        System.out.println("hasil2= " +str);
        
        //cara 3
        double c = 1.23;
        String str2 = Double.toString(c);
        System.out.println("hasil3= " +str1);
    }
}
