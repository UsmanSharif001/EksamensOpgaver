package NamesØvelse;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {

        NamesØvelse1 name1 = new NamesØvelse1("Aslan", "A.", "Sharif");
        NamesØvelse1 name2 = new NamesØvelse1("Bard", "B.", "Sharif");
        NamesØvelse1 name3 = new NamesØvelse1("Colt", "C.", "Sharif");
        NamesØvelse1 name4 = new NamesØvelse1("Dan", "D.", "Sharif");
        NamesØvelse1 name5 = new NamesØvelse1("Elaine", "E.", "Sharif");
        NamesØvelse1 name6 = new NamesØvelse1("Usman", "Sharif");

        ArrayList<NamesØvelse1> nameList = new ArrayList<>(List.of(name1, name2, name3, name4, name5, name6));

        Spliterator<NamesØvelse1> spliterator = nameList.spliterator();
        spliterator.forEachRemaining(NamesØvelse1 -> System.out.println("First names in list: " + NamesØvelse1.getFirstName()));

        List<String> mapStringGetName = nameList.stream().map(namesToPrint -> namesToPrint.getFirstName().trim().toLowerCase() + " " + namesToPrint.getLastName().toUpperCase().trim()).toList();

        List<String>multiNameMapping = nameList.stream().map(mulitNames -> mulitNames.getFirstName() + mulitNames.getLastName()).toList();



      mapStringGetName.forEach(mapFullName -> System.out.println("Full name: " + mapFullName));

        System.out.println("Test: ");

        mapStringGetName.forEach(printName -> System.out.println("The name: " + printName));




        String name10 = "Usman Sharif@Dam Sharif@Uan Sharif@";
        String name11 = "";
        String name12 = "";

        String allNames = name10.trim() + name11.trim() + name12.trim();
        String[] arrayOfString = allNames.split("@");


        for (String names : arrayOfString) {
            System.out.println(names);

        }














    }


}
