package Day14;

public class main {
    
    public static void main(String[] args) {
        //Mengubah String menjadi Tipe data Primitif
        
        //String - Byte
        String a1 = "123";
        byte b1 = Byte.parseByte(a1);
        System.out.println("a1 = " + b1);
        
        //String - short
        String a2 = "123";
        short b2 = Short.parseShort(a2);
        System.out.println("a2 = "+ b2);
        
        //String - integer
        String a3 = "123";
        int b3 = Integer.parseInt(a3);
        System.out.println("a3 = "+ b3);
        
        //String - long
        String a4 = "1234567890";
        long b4 = Long.parseLong(a4);
        System.out.println("a4 = "+ b4);
        
        //String - float
        String a5 = "123.45";
        float b5 = Float.parseFloat(a5);
        System.out.println("a5 = "+ b5);
        
        //String - double
        String a6 = "123.45";
        double b6 = Double.parseDouble(a6);
        System.out.println("a6 = "+ b6);
        
        //String - Boolean
        String a7 = "true";
        boolean b7 = Boolean.parseBoolean(a7);
        System.out.println("a7 = "+ b7);
        
        //String - Char
        String a8 = "a";
        char b8 = a8.charAt(0);
        System.out.println("a8 = "+ b8);
        
        //Penjelasan
        /*Dengan mengonversi tipe data String menjadi tipe data primitif, 
        kita bisa menggunakan nilai tersebut dalam berbagai operasi dan membuat kode program lebih efektif
        *Konverensi ini berguna ketika kita memiliki data dalam bentuk String dan ingin menggunakannya dalam
        operasi matematika atau logika yang memerlukan tipe data primitif.
        */
        
    }
}
