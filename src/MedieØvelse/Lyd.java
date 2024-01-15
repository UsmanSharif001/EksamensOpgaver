package MedieØvelse;

public class Lyd extends Medie{

    private int loudness;

    private Medie medie;

    public Lyd(String name, double duration, int loudness) {
        super(name, duration);
        this.loudness = loudness;

    }

    public void setLoudness(int loudness) {
        this.loudness = loudness;
    }



    @Override
    public String toString() {
        String medieString = super.toString();
        return medieString + " Lyd: " +
                " loudness: " + loudness+"dB";
    }
}
