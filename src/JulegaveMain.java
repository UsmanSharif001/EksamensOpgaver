public class JulegaveMain {
    public static void main(String[] args) {
        Julegave julegave = new Julegave();

        for (int i = 0; i < 5; i++) {
            boolean couldBeLego = julegave.couldBeLego();
            System.out.println(julegave);
            System.out.println(couldBeLego);
            System.out.println();
        }


    }
}
