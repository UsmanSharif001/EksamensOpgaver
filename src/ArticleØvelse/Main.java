package ArticleØvelse;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Article article1 = new Article("Øvelse 11", "Lav en klasse Article der har tre attributter: heading, body og author. Lav test-kode der sætter \n" +
                "alle tre attributter, og sørg for at body er en lang tekst – f.eks. indholdet af denne \n" +
                "øvelsesbeskrivelse!", "Usman Sharif");


        article1.setBody("Lav en klasse Article der har tre attributter: heading, body og author. Lav test-kode der sætter \n" +
                "alle tre attributter, og sørg for at body er en lang tekst – f.eks. indholdet af denne \n" +
                "øvelsesbeskrivelse!");


        String longestWord = article1.getLongestWord();

        System.out.println(longestWord);



        Article article2 = new Article("Bla", "Der var engang engang der var", "Amber");
        article2.setBody("Der var engang engang der var");
        System.out.println(article2);

        System.out.println("Test: ");
        article2.removeDuplicatedWords();
        System.out.println(article2);


        Article article = new Article();

        article.setBodyList(Arrays.asList("example", "body", "words", "a"));





       List<String> partialWordList = article.getBodyList().stream()
                .map(word -> word.substring(0, Math.min(3, word.length())))
                .collect(Collectors.toList());

        System.out.println(partialWordList);

        String getSmallestWord = article.getBodyList().stream().min(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(getSmallestWord);

        String getBiggestWord = article.getBodyList().stream().max(Comparator.comparing(String::length)).orElse(null);


        String biggestWord = article.getBodyList().stream().max(Comparator.comparing(String::length)).orElse(null);






    }
}
