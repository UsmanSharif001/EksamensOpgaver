package TekstØvelse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Tekst {

   private List<String> tekstLinjer;


   public Tekst() {
       this.tekstLinjer = new ArrayList<>();
   }

   public void addTekst(String tekst) {
       tekstLinjer.add(tekst);
   }

   public String findAntalUnikke(String tekst) {

       if (tekst == null) {
           return "Tekst ikke initilaseret";
       }
       List<String> unikkeLinjer = new ArrayList<>();
           String[] linjer = tekst.split(" ");
           for (String linje : linjer) {
               unikkeLinjer.add(linje.trim());

           }
           return unikkeLinjer.toString();
       }


    public String getTekst() {
       return tekstLinjer.toString();
   }

    @Override
    public String toString() {
        return "Tekst: " +
                "tekstLinjer=" + tekstLinjer +
                '}';
    }
}
