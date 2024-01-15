package FilmØvelse;

import FilmØvelse.Film;

public class Producer extends Film {
    private String producer;

    public Producer(String filmTitel, Integer udgivelsesÅr) {
        super(filmTitel, udgivelsesÅr);
        this.producer = setProducer();
    }

    public String setProducer() {
        this.producer = producer;
        return producer;
    }


}
