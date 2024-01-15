package DreamØvelse;

import java.time.LocalDate;

public class Dream implements Comparable<Dream>{
    private LocalDate date;
    private int duration;
    private String type;


    public Dream(LocalDate date, int duration, String type) {
        this.date = date;
        this.duration = duration;
        this.type = type;

    }

    public boolean isPleasant() {
        return type.equals("våd");
    }
    public int compareTo(Dream otherDream) {
        return this.date.compareTo(otherDream.date);
    }

    public LocalDate getDate() {
        return date;
    }
    public int getDuration() {
        return duration;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dream" +
                "date=" + date +
                ", duration=" + duration +
                ", type=" + type;
    }
}
