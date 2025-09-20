package Day13;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner p = new Scanner (System.in);
        
        //nomor 1
        
          //file1
          //package Class;
          
          //file2
          //public class Class3 {}
          
          //file3
          //public static void main(String[] args) {}

          
        //nomor 2
       
       //Deklarasi : adalah untuk menentukan variabel dan tipe data
       String nama;
       char kelas ; 
       int umur ;
       double tinggi ; 
       float berat ;
       long panjang ; 
       short sedang ; 
       byte pendek ;
       boolean baik ;
       
       //Inisialisasi : adalah untuk mengisi nilai awal pada variabel setelah dideklarasi
       nama = "Fatiin";
       kelas = 'B';
       umur = 19;
       tinggi = 154;
       berat = 45;
       panjang = 1999;
       sedang = 199;
       pendek = 19;
       baik = true;
       
       //Update variabel : adalah untuk proses mengubah nilai yang sudah ada pada variabel
       nama = "Alya";
       kelas = 'C';
       umur = 18;
       tinggi = 145;
       berat = 54;
       panjang = 1888;
       sedang = 188;
       pendek = 18;
       baik = false;
       
       
       //nomor 3
       
       System.out.print("Nama: ");
        String Nama = p.nextLine();
        
        System.out.print("Umur: ");
        int Umur = p.nextInt();
        
        p.nextLine();
        
        System.out.print("NIM: ");
        String NIM = p.nextLine();
        
        System.out.print("Status: ");
        boolean Status = p.nextBoolean();
        
        System.out.print("Tinggi: ");
        float Tinggi = p.nextFloat();
        
        System.out.print("Berat: ");
        float Berat = p.nextFloat();
        
        System.out.print("Kelas: ");
        char Kelas = p.next().charAt(0);
        
        p.nextLine();
        
        System.out.print("Alamat: ");
        String Alamat = p.nextLine();
      
        System.out.println("====== Biodata Mahasiswa ======");
        System.out.println("Nama \t\t:\t"+ Nama);
        System.out.println("Umur \t\t:\t"+ Umur +" Tahun");
        System.out.println("NIM \t\t:\t"+ NIM);
        System.out.println("Status \t\t:\t"+ Status);
        System.out.println("Tinggi Badan\t:\t"+ Tinggi+ " cm");
        System.out.println("Berat Badan\t:\t"+ Berat + " kg");
        System.out.println("Kelas\t\t:\t"+ Kelas);
        System.out.println("Alamat\t\t:\t"+ Alamat);
    }
}
  

