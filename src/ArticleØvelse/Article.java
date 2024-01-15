package ArticleØvelse;

import java.util.*;
import java.util.stream.Collectors;

public class Article {

    private String heading;
    private String body;
    private String author;

    private List<String> bodyList;


    public Article (String heading, String body, String author) {

        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public Article() {
        this.body = String.valueOf(new ArrayList<>());

    }

    public String getLongestWord() {


        if (!bodyList.isEmpty() && !body.isEmpty()) {

            return bodyList.stream().max(Comparator.comparingInt(String::length)).orElse(null);


        }
        return null;
    }

    public String getHeading() {
        return heading;
    }
    public String getBody() {
        return body;
    }
    public String getAuthor() {
        return author;
    }

    public void setBody(String body) {
        this.body = body;
        setBodyList(Arrays.asList(body.split(" ")));
    }

    public List<String> getBodyList() {
        return bodyList;
    }

    public void setBodyList(List<String> bodyList) {
        this.bodyList = new ArrayList<>(bodyList);
    }


    //virker ikke som den skal
    public void removeDuplicatedWords() {

        Set<String> uniqueWords = new HashSet<>();

        bodyList.removeIf(word -> !uniqueWords.add(word));
        body = String.join(" ", bodyList);


    }

    public List<String> getPartialBodyList(int start, int end) {
        return bodyList.stream()
                .map(word -> word.substring(start, Math.min(end, word.length())))
                .collect(Collectors.toList());
    }



    @Override
    public String toString() {
        return "Article" +
                "heading: " + heading + '\'' +
                " body: " + body + '\'' +
                " author: " + author + '\'' +
                '}';
    }
}
