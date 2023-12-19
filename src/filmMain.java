import java.time.LocalDate;
import java.util.ArrayList;

public class filmMain {
    public static void main(String[] args) {
        Film film1 = new Film("Testman", 1991);
        Film film2 = new Film("BestMan", 1992);
        Film film3 = new Film("Crestman", 1993);

      ArrayList<Film> filmsWithSetYears = new ArrayList<>();
      filmsWithSetYears.add(film1);
      filmsWithSetYears.add(film2);
      filmsWithSetYears.add(film3);

        for (Film films: filmsWithSetYears) {
            System.out.println(films);

        }



        Film film4 = new Film("AquaMan", LocalDate.now());
        Film film5 = new Film("SpiderMan", LocalDate.now());
        Film film6 = new Film("SuperMan", LocalDate.now());

        ArrayList<Film> filmYear = new ArrayList<>();
        filmYear.add(film4);
        filmYear.add(film5);
        filmYear.add(film6);
        for (Film filmYearList: filmYear) {
            System.out.println(filmYearList);

        }

        Film film7 = new Producer("Batman", 1992, "A");
        Film film8 = new Producer("Superman", 1993, "B");
        Film film9 = new Producer("WhateverMan", 1994, "C");

        ArrayList<Film> filmsToList = new ArrayList<>();
        filmsToList.add(film7);
        filmsToList.add(film8);
        filmsToList.add(film9);

        for (Film films: filmsToList)
        {
            System.out.println(films);

        }




    }

}
