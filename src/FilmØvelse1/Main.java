package FilmØvelse1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        Film film1 = new Film("This Year Movie");

        Film film2 = new Film("I set the Year Movie", 2020);

        Producer producerMovie = new Producer("I am the Producer", "Usman", 2023);

        film1.setProducer(producerMovie);
        System.out.println(film1);

        ArrayList<Film> movieList = new ArrayList<>();

        movieList.addAll(List.of(film1, film2, producerMovie));

        //movieList.forEach(System.out::println);
    }
}
