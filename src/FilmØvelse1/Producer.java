package FilmØvelse1;

public class Producer extends Film {

    private String producer;


    public Producer(String filmTitel, String producer, int udgivelsesÅr) {
        super(filmTitel, udgivelsesÅr);

        this.producer = producer;


    }

    public String getProducer() {
        return producer;
    }
}
