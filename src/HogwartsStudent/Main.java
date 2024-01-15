package HogwartsStudent;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HogwartStudent s1 = new HogwartStudent("Harald", "Stenk", "Chanka");
        HogwartStudent s2 = new HogwartStudent("Ben", "Johnsen", "Ravenclaw");
        HogwartStudent s3 = new HogwartStudent("Ash", "Stenk", "Hufflepuff");
        HogwartStudent s4 = new HogwartStudent("Charles", "Johnsen", "Gryffindor");
        HogwartStudent s5 = new HogwartStudent("Dam", "Abrahamson", "Slytherin");
        HogwartStudent s6 = new HogwartStudent("Liam", "Stenk", "Gryffindor");
        HogwartStudent s7 = new HogwartStudent("Kelley", "Abrahamson", "Slytherin");
        HogwartStudent s8 = new HogwartStudent("Sofie", "Stenk", "Hufflepuff");
        HogwartStudent s9 = new HogwartStudent("Hellen", "Stenk", "Hufflepuff");
        HogwartStudent s10 = new HogwartStudent("Casper", "Stenk", "Chanka");



        s1.setHouse("Test1");
        s2.setHouse("Test2");

        ArrayList<HogwartStudent> filteredList = new ArrayList<>();

        filteredList.addAll(List.of(s1,s2,s3,s4,s5,s6,s7));
        filteredList.add(s8);
        filteredList.add(s9);
        filteredList.add(s10);

       Collections.sort(filteredList, new LastNameComparator());

       for (HogwartStudent student : filteredList) {
           System.out.println(student);
       }



      Spliterator<HogwartStudent> hogwartStudentSpliterator = filteredList.spliterator();

       hogwartStudentSpliterator.forEachRemaining(hogwartStudent -> System.out.println("House: " + hogwartStudent.getHouse() + " Student name: " + hogwartStudent.getFirstName() + " " + hogwartStudent.getLastName()));

        System.out.println("test:");

//       List<HogwartStudent> compareHouse = filteredList.stream().sorted(Comparator.comparing(HogwartStudent::getHouse).thenComparing(HogwartStudent::getLastName)).toList();
//
//
//       compareHouse.forEach(student -> System.out.println("House they belong to: " + student.getHouse() +" last name: " + student.getLastName()));









    }
}
