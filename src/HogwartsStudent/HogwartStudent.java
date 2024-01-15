package HogwartsStudent;

import java.util.Comparator;

public class HogwartStudent {

    private String firstName;
    private String lastName;
    private String house;

    public HogwartStudent(String firstName, String lastName, String house) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;

    }

    public String getLastName() {
        return lastName;
    }

    public String getHouse() {
        return house;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setHouse(String house) {

        try {
            if (house.endsWith("Slythering") || house.endsWith("Gryffindor") ||
                    house.endsWith("Ravenclaw") || house.endsWith("Hufflepuff")) {

                setHouse(house);

            } else {
                throw new IllegalArgumentException(" Invalid house: " + house);

            }

        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught" + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "HogwartStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", house='" + house + '\'' +
                '}';
    }

}
