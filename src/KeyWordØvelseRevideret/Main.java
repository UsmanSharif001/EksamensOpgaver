package KeyWordØvelseRevideret;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        KeyWordØvelse keyWordØvelse1 = new KeyWordØvelse("Appelsin", "Et stykke frugt der indeholder C-vitamin blandt andet");
        KeyWordØvelse keyWordØvelse2 = new KeyWordØvelse("Æble", "Et stykke frugt der indeholder D-vitamin blandt andet");
        KeyWordØvelse keyWordØvelse3 = new KeyWordØvelse("Pære", "Et stykke frugt der indeholder E-vitamin blandt andet");

keyWordØvelse2.seeAlso();

        List<KeyWordØvelse> frugtListe = new ArrayList<>();

        frugtListe.addAll(List.of(keyWordØvelse1,keyWordØvelse2,keyWordØvelse3));

        frugtListe.forEach(System.out::println);

        List<String> træSeeAlso = List.of("Buske, Planter, Natur", "");

        KeyWordØvelse keyWordØvelse4 = new KeyWordØvelse("Træ", "Et træ er en plante" + " Se også: " +  træSeeAlso);
        System.out.println(keyWordØvelse4);

        List<String> frugtSeeAlso = List.of(" Se også: Vindruer, Mango, Vandmelon");

        KeyWordØvelse keywordØvelse5 = new KeyWordØvelse("Mandarin","En frugt" + frugtSeeAlso + " ");

        System.out.println(keywordØvelse5);

    }
}
