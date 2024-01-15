package MediaØvelse;

import MediaØvelse.Media;

public class Audio extends Media {

    private double loudness;

    public Audio(String name, double duration, double loudness) {
        super(name, duration);
        this.loudness = loudness;
    }

    @Override
    public String toString() {
        String mediaString = super.toString();
        return mediaString + "MediaØvelse.Audio{" +
                "loudness=" + loudness +
                '}';
    }
}
