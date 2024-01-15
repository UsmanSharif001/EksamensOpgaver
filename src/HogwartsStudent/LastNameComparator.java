package HogwartsStudent;

import java.util.Comparator;

public class LastNameComparator implements Comparator<HogwartStudent> {

    @Override
    public int compare(HogwartStudent hogwartStudent1, HogwartStudent hogwartStudent2) {

        return hogwartStudent1.getLastName().compareTo(hogwartStudent2.getLastName());
    }
}
