public class Producer extends Film {
    private String producer;

    public Producer(String filmTitel, Integer udgivelsesÅr, String producer) {
        super(filmTitel, udgivelsesÅr);
        this.producer = setProducer();
    }
    public String setProducer() {
        this.producer = producer;
        return producer;
    }


}
