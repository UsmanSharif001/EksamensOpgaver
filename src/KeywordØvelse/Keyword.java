package KeywordØvelse;

import java.util.ArrayList;
import java.util.List;

public class Keyword {

    private String word;
    private String definition;

    private List<String> seeAlsoList;




    public Keyword (String word, String definition) {
        this.word = word;
        this. definition = definition;
        this.seeAlsoList = new ArrayList<>();
    }

    public boolean matches(String fullWord, String partialWord){
        fullWord = fullWord.toLowerCase();
        partialWord = partialWord.toLowerCase();

        return fullWord.contains(partialWord);
    }

    public void seeAlso(String relatedWord) {
        seeAlsoList.add(relatedWord);
    }
    public List <String> getSeeAlsoList(){
        return seeAlsoList;
    }



}
