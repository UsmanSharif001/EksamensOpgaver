package RafleBægerØvelse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RafleBæger {

    private int antalTerninger;
    private Random antalØjne;

    List<Integer> kastListe = new ArrayList<>();


    public RafleBæger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
        this.antalØjne = new Random();

    }

    public void rystTerninger() {
        for (int i = 0; i < antalTerninger; i++) {
            int terningØjne = antalØjne.nextInt(6) + 1;
            kastListe.add(terningØjne);

        }
    }

    @Override
    public String toString() {
        return "RafleBæger: " +
                "antalTerninger=" + antalTerninger +
                ", antalØjne=" + kastListe;
    }
}
