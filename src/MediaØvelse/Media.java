package MediaØvelse;

public abstract class Media {
    private String name;
    private double duration;

    public Media(String name, double duration) {
        this.name = name;
        this.duration = duration;

    }

    @Override
    public String toString() {
        return "MediaØvelse.Media{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
