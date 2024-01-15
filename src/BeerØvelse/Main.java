package BeerØvelse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Beer beer1 = new Beer("Carlsberg");
        Beer beer2 = new Beer("TroldeØl");
        Beer beer3 = new Beer("Solaris");
        Beer beer4 = new Beer("PolarØL");

        beer1.setPrice(100);
        beer1.setAlchoholPercentage(65);

        beer2.setPrice(120);
        beer2.setAlchoholPercentage(50);

        beer3.setPrice(199);
        beer3.setAlchoholPercentage(99);

        beer4.setPrice(12);
        beer4.setAlchoholPercentage(33);

        ArrayList<Beer> beerList = new ArrayList<>();

        beerList.addAll(List.of(beer1,beer2,beer3,beer4));


        for (Beer beer : beerList)  {
            System.out.println(beer);
        }


        double total = 0;
        for (Beer beer : beerList) {
            total += beer.getPrice();
        }

        if (!beerList.isEmpty()) {
            double averagePrice = total / beerList.size();
            System.out.println("Average prices on beer: " + averagePrice);
        }




    }
}
