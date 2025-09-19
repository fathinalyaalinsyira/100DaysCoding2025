package Day12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
         //Membuat Program Biodata Sederhana 
             
        //Scanner biodata
        String nama = "BIODATA";
                
        System.out.print("Masukkan nama: ");
        String Nama = p.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String Nim = p.nextLine();
        
        System.out.print("Masukkan umur: ");
        int Umur = p.nextInt();
        
        System.out.print("Masukkan kelas: ");
        char Kelas = p.next().charAt(0);
        
        p.nextLine();
        
        System.out.print("Masukkan alamat: ");
        String Alamat = p.nextLine();
        
        System.out.print("Masukkan tinggi badan: ");
        double Tinggi = p.nextDouble();
        
        System.out.print("Masukkan berat badan: ");
        float Berat = p.nextFloat();
        
        System.out.print("Masukkan jarak: ");
        long Jarak = p.nextLong();
        
        System.out.print("Masukkan ukuran: ");
        byte Ukuran = p.nextByte();
        
        System.out.print("Lulus: ");
        boolean Lulus =p.nextBoolean();
        
        //mencetak
        System.out.println(nama);
        System.out.println("Nama saya "+ Nama);
        System.out.println("NIM saya "+ Nim);
        System.out.println("Umur saya "+ Umur + "Tahun");
        System.out.println("Saya kelas "+ Kelas);
        System.out.println("Alamat saya "+ Alamat);
        System.out.println("Tinggi badan saya "+ Tinggi +" cm");
        System.out.println("Berat badan saya "+ Berat +" kg");
        System.out.println("Jarak kost ke kampus "+ Jarak + " km");
        System.out.println("Ukuran sepatu "+ Ukuran);
        System.out.println("Saya lulus "+ Lulus);
        
   
        //Penjelasan mengenai penggunaan scanner untuk membaca input dari tipe data String,Int,Char,Double,Float,Long,Byte, dan Boolean
        /*String : nextLine() : Membaca seluruh baris input
                 : next() : Membaca input string hingga spasi pertama
         *Integer(int) : nextInt()
         *Char   : next.charAt(0)
         *Float  : nextFloat()
         *Double : nextDouble()
         *Long   : nextLong()
         *Byte   : nextByte()
         *Boolean: nextBoolean()
        */
        
        //Penjelasan
        /*Jika ada method "nextLine" setelah "next" untuk data primitif, itu akan menghasilkan "nextLine" tidak membaca input karna dianggap input kosong,
        maka
        Dengan menambahkan nextLine() setelah menggunakan metode next() untuk data primitif, kita bisa memastikan bahwa nextLine berikutnya akan membaca input dengan benar.
       */
    }
}
