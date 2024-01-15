package BilOgTrailerØvelse;

public class Bil {

    private int vægt;

    private Trailer trailer;

    public Bil(int vægt, Trailer trailer) {


        this.vægt = vægt;
        this.trailer = trailer;
    }

    public boolean totalVægten() {

        if (this.vægt + trailer.getVægt() > 3500) {
            System.out.println("Too heavy");
            return false;
        }
        else {
            System.out.println("Trailer added");
            return true;
        }

    }





}
