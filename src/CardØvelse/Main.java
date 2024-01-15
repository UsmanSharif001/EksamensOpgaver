package CardØvelse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Card card1 = new Card(13, SuitEnum.SPADES);
        Card card2 = new Card(13, SuitEnum.CLUBS);
        Card card3 = new Card(21, SuitEnum.CLUBS);
        Card card4 = new Card(21, SuitEnum.DIAMONDS);

        card1.challengeCard(card2);

        card3.challengeCard(card4);

        card4.challengeCard(card1);
        card1.challengeCard(card4);







    }
}
