package JulegaveØvelse;

import JulegaveØvelse.Julegave;

public class JulegaveMain {
    public static void main(String[] args) {
        Julegave julegave = new Julegave();

        for (int i = 0; i < 25; i++) {
            boolean couldBeLego = julegave.couldBeLego();
            System.out.println(julegave);
            System.out.println(couldBeLego);
            System.out.println();
        }


    }
}
