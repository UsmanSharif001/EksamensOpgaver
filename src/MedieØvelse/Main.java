package MedieØvelse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       Lyd lyd1 = new Lyd("Link Park", 3.22, 10);
       Video vid1 = new Video("Bat", 130, "16:9");



        ArrayList<Medie>medieObjekter = new ArrayList<>();

        vid1.setAspectRatio("3:4");
        lyd1.setLoudness(4);

        medieObjekter.addAll(List.of(lyd1,vid1));
        medieObjekter.forEach(System.out::println);
    }
}
