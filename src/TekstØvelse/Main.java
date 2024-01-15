package TekstØvelse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tekst tekst1 = new Tekst();
        Tekst tekst2 = new Tekst();

        tekst1.addTekst("Dette er tekst for tekst 1");
        tekst2.addTekst("Dette er tekst for tekst 2");


        List<String> samletTekst = new ArrayList<>();

        String Rams = "Rams";
        String Goats = "Goats";
        samletTekst.add(Goats);
        samletTekst.add(Rams);

        boolean doesItContainRams = samletTekst.contains(Rams);
        boolean doesItContainBla = samletTekst.contains(Goats);

        if (doesItContainBla && doesItContainRams) {
            System.out.println("List contains of rams and goats");
            for (String testList : samletTekst) {
                System.out.println(testList);
            }

        }else System.out.println("No rams nor goats");




        samletTekst.add(tekst2.getTekst());
        samletTekst.add(tekst2.findAntalUnikke("BLABLALBALSåkomblabla123"));


        for (String tekstPrint : samletTekst) {
            System.out.println(tekstPrint);
        }





    }
}
