package HogwartsStudent;

import java.util.Comparator;

public class houseComparator implements Comparator<HogwartStudent> {
    @Override
    public int compare(HogwartStudent house1, HogwartStudent house2) {
        return house1.getHouse().compareTo(house2.getHouse());
    }
}
