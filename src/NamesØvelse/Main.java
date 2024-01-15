package NamesØvelse;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {

        NamesØvelse1 name1 = new NamesØvelse1("Usman", "A.", "Sharif");
        NamesØvelse1 name2 = new NamesØvelse1("Usman", "B.", "Sharif");
        NamesØvelse1 name3 = new NamesØvelse1("Usman", "C.", "Sharif");
        NamesØvelse1 name4 = new NamesØvelse1("Usman", "D.", "Sharif");
        NamesØvelse1 name5 = new NamesØvelse1("Usman", "E.", "Sharif");
        NamesØvelse1 name6 = new NamesØvelse1("Usman", "Sharif");
        NamesØvelse1 name7 = new NamesØvelse1("Emilie Haugelund");
        NamesØvelse1 name8 = new NamesØvelse1("Emilie Larsen");
        NamesØvelse1 name9 = new NamesØvelse1("Emilie Haugdasund");

     ArrayList<NamesØvelse1> nameList = new ArrayList<>();

     nameList.add(name1);
     nameList.add(name2);
     nameList.add(name3);
     nameList.add(name4);
     nameList.add(name5);
     nameList.add(name6);

        Spliterator<NamesØvelse1> spliterator = nameList.spliterator();
        spliterator.forEachRemaining(System.out::println);




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
