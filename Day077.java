package Day77;

public class Main77 {

    public static void main(String[] args) {
        //methode string untuk manipulasi (substring(), replace(), trim()).

        String nama = "Fathin Al'ya Al'Insyira ";
        System.out.println(nama);
        System.out.println(nama.length());

        //substring()
        String fathin = nama.substring(0, 6);
        System.out.println(fathin);

        //replace()
        String replace = nama.replace("Al'ya Al'Insyira", "Cantik dan Baik");
        System.out.println(replace);

        //trim()
        String trim = nama.trim();
        System.out.println(trim.length());
    }
}
