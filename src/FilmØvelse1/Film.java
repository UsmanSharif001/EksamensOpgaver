package FilmØvelse1;

import java.time.LocalDate;

public class Film {

    private String filmTitel;
    private int udgivelsesÅr;

    private LocalDate thisYear;

    private Producer producer;



    public Film (String filmTitel, int udgivelsesÅr) {
        this.filmTitel = filmTitel;

        this.udgivelsesÅr = udgivelsesÅr;
    }

    public Film (String filmTitel) {
        this.filmTitel = filmTitel;

        this.thisYear = LocalDate.now();
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Film: " +
                "filmTitel='" + filmTitel + '\'' +
                ", udgivelsesÅr=" + udgivelsesÅr +
                ", thisYear=" + thisYear +
                ", producer=" + producer +
                '}';
    }
}
