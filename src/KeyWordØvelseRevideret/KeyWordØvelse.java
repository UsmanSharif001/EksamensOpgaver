package KeyWordØvelseRevideret;

import KeywordØvelse.Keyword;

import java.util.List;

public class KeyWordØvelse {

    private String name;
    private String description;

    private List<String> seeAlso;

    public KeyWordØvelse(String name, String description) {

        this.name = name;

        this.description = description;
    }

    public void seeAlso() {
        try {
            if (seeAlso != null && !seeAlso.isEmpty()) {
                System.out.println("See also: ");
                for (String keyword : seeAlso) {
                    System.out.println("Keyword: " + keyword);
                }
            } else {
                throw new RuntimeException("Exception found: " + seeAlso);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override
    public String toString() {
        return "KeyWordØvelse: " +
                "name: " + name + '\'' +
                " description: " + description;
    }
}
