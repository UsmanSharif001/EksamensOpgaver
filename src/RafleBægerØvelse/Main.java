package RafleBægerØvelse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RafleBæger kast1 = new RafleBæger(5);
        RafleBæger kast2 = new RafleBæger(10);
        RafleBæger kast3 = new RafleBæger(2);
        RafleBæger kast4 = new RafleBæger(12);

       kast1.rystTerninger();
       kast2.rystTerninger();
       kast3.rystTerninger();
       kast4.rystTerninger();

        ArrayList<RafleBæger> samletTerningKastListe = new ArrayList<>();

        samletTerningKastListe.addAll(List.of(kast1,kast2,kast3,kast4));

        samletTerningKastListe.forEach(System.out::println);




    }
}
