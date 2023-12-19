import java.util.Random;

public class Julegave13 {
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;


    public Julegave13() {
        Random random = new Random();
        this.isSoft = random.nextBoolean();
        this.isRectangular = random.nextBoolean();
        this.doesRattle = random.nextBoolean();
    }

    public boolean couldBeLego(){
        return !isSoft && isRectangular && doesRattle;
    }

    @Override
    public String toString() {
        return "Julegave13" +
                "isSoft=" + isSoft +
                ", isRectangular=" + isRectangular +
                ", doesRattle=" + doesRattle;
    }
}
