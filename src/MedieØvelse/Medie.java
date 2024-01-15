package MedieØvelse;

import java.util.ArrayList;

public abstract class Medie {

    private String name;
    private double duration;


    public Medie(String name, double duration) {
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
        return "Medie: " +
                "name: " + name +
                " duration: " + duration;
    }
}


