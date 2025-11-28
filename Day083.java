package Day83;

public class Main83 {

    public static void main(String[] args) {
        //menjumlahkan elemen array

        int[] a = {2, 4, 6, 8, 10};
        int hitung = 0;

        for (int i = 0; i < a.length; i++) {
            hitung += a[i];
        }
        System.out.println("hasil penjumlahan = " + hitung);
    }

}
