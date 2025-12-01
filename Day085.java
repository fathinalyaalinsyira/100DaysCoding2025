package Day85;

public class Main85 {

    public static void main(String[] args) {
        //menentukan angka maksimal array

        int[] a = {16, 6, 66, 61, 166, 11};

        int x = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > x) {
                x = a[i];
            }
        }

        System.out.println("angka maksimal dalam array = " + x);
    }

}
