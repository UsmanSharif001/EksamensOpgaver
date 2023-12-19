import java.util.Random;

public class Julegave {

    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;


    public Julegave() {
        Random random = new Random();
        this.isSoft= random.nextBoolean();
        this.isRectangular= random.nextBoolean();
        this.doesRattle= random.nextBoolean();

    }

    public boolean couldBeLego() {
        return !isSoft && isRectangular && doesRattle;
    }

    @Override // henter en metode i superklassen object - nedarver en metode fra object klassen.
    public String toString() {
        return "isSoft=" + isSoft +
                ", isRectangular=" + isRectangular +
                ", doesRattle=" + doesRattle +
                '}';
    }
}
