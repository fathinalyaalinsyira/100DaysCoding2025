package Day97;

public class Main97 {

    public static void main(String[] args) {
        //menghitung luas persegi dengan method non-void dan parameternya

        int hasil = angka(8);
        System.out.println("luas persegi = " + hasil);
    }

    public static int angka(int sisi) {
        return sisi * sisi;
    }
}
