package KeywordØvelse;

import KeywordØvelse.Keyword;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Keyword keyword = new Keyword("Example", "Clarifies");

        String fullWord = "JavaProgramming";
        String partialWord = "JAVa";
        String partialWord2 = "zz";

        System.out.println("Full word" + fullWord);
        System.out.println("Partial word" + partialWord);
        System.out.println("Partial word" + partialWord2);

        System.out.println("Partial word match 1: " + keyword.matches(fullWord, partialWord));
        System.out.println("Partial word match 2: " + keyword.matches(fullWord, partialWord2));
        keyword.seeAlso("Prograaming in general");
        keyword.seeAlso("Object orientated");

        List<String> seeAlsoList = keyword.getSeeAlsoList();
        System.out.println("See also: " + seeAlsoList);


    }
}
