package KortØvelse;

import Candidate.Candidate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {

        Kort kort1 = new Kort(10, SuitEnum.SPADES);
        Kort kort2 = new Kort(1, SuitEnum.DIAMONDS);
        Kort kort3 = new Kort(7, SuitEnum.HEARTS);
        Kort kort4 = new Kort(99, SuitEnum.SPADES);
        Kort kort5 = new Kort(99, SuitEnum.CLUBS);
        Kort kort6 = new Kort(10, SuitEnum.SPADES);


        kort1.challenges(kort2);

        kort5.challenges(kort4);

        ArrayList<Kort> cardDeck = new ArrayList<>();

        cardDeck.addAll(List.of(kort1,kort2,kort3,kort4,kort5,kort6));

        cardDeck.forEach(System.out::println);

        List<Kort> sortByValue = cardDeck.stream().sorted(Comparator.comparingInt(Kort::getValue).thenComparing(Kort::getSuitEnum).reversed()).collect(Collectors.toList());

        System.out.println("Her er listen af kort deck sorteret efter value og suit");

        sortByValue.forEach(System.out::println);


        Spliterator<Kort> kortValueKun = cardDeck.spliterator();

        kortValueKun.forEachRemaining(Kort -> System.out.println(Kort.getValue()));

        Spliterator<Kort>suitValueKun = cardDeck.spliterator();

        suitValueKun.forEachRemaining(suit -> System.out.println(suit.getSuitEnum()));


    }
}
