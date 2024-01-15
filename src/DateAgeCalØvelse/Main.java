package DateAgeCalØvelse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        DateAgeCalculator date1 = new DateAgeCalculator(28, 10);
        DateAgeCalculator date2 = new DateAgeCalculator(28, 22);
        DateAgeCalculator date3 = new DateAgeCalculator(28, 44);
        DateAgeCalculator date4 = new DateAgeCalculator(28, 12);
        DateAgeCalculator date5 = new DateAgeCalculator(28, 19);


        boolean result0 = date1.acceptableDateAge();
        boolean result1 = date2.acceptableDateAge();
        boolean result2 = date3.acceptableDateAge();
        boolean result3 = date4.acceptableDateAge();
        boolean result4 = date5.acceptableDateAge();

        List<Boolean> results = new ArrayList<>();

        results.add(result0);
        results.add(result1);
        results.add(result2);
        results.add(result3);
        results.add(result4);

        System.out.println("Acceptable: " + result0);

        for (int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));

        }






    }
}
