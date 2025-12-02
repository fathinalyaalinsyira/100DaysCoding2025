package Day86;

public class Main86 {

    public static void main(String[] args) {
        //menentukan angka minimal array

        int[] a = {16, 6, 66, 61, 166, 11};

        int x = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < x) {
                x = a[i];
            }
        }

        System.out.println("angka minimal dalam array = " + x);
    }

}
