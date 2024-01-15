package MediaØvelse;

public abstract class Media {
    private String name;
    private double duration;

    public Media(String name, double duration) {
        this.name = name;
        this.duration = duration;

    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "MediaØvelse.Media{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
