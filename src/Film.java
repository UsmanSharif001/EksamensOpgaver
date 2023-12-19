import java.time.LocalDate;

public class Film {
    private String filmTitel;
    private int udgivelsesÅr;
    private LocalDate thisYear;


    public Film(String filmTitel, int udgivelsesÅr) {
        this.filmTitel = filmTitel;
        this.udgivelsesÅr = udgivelsesÅr;
    }

   public Film(String filmTitel, LocalDate thisYear) {
        this.filmTitel = filmTitel;
        this.thisYear = thisYear;
   }

    public void setUdgivelsesÅr(int udgivelsesÅr) {
        this.udgivelsesÅr = udgivelsesÅr;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmTitel='" + filmTitel + '\'' +
                ", udgivelsesÅr=" + udgivelsesÅr +
                "i år den ="+ thisYear +
                '}';
    }
}
