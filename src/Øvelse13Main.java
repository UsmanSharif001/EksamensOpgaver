public class Øvelse13Main {
    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            Julegave13 julegave13 = new Julegave13();
            boolean couldBeLego = julegave13.couldBeLego();
            System.out.println(julegave13);
            System.out.println(couldBeLego);

        }
    }
}
