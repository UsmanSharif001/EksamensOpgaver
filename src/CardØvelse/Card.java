package CardØvelse;

public class Card {

    private int value;
    private SuitEnum suit;



    public Card(int value, SuitEnum suit) {

        this.value = value;
        this.suit = suit;

    }

    public boolean challengeCard(Card otherCard) {
        if (this.value > otherCard.getValue()) {
            System.out.println(value + " beats " + otherCard.getValue() + " based on value");

            return this.value>otherCard.getValue();

        }
        if (otherCard.getValue() > this.value) {
            System.out.println(otherCard.value + " beats " + this.value + " based on value ");
        }

        else if (this.value == otherCard.getValue()) {
            if (this.suit.ordinal() < otherCard.getSuit().ordinal())
                System.out.println(this + " beats " + otherCard + " based on suit");
            else if (this.suit.ordinal() > otherCard.getSuit().ordinal()) {
                System.out.println(otherCard + " beats " + this + " based on suit");

            }
            return true;



        } else if (otherCard.getValue() > this.value) {
            System.out.println(otherCard + " beats " + this.value);
        } return true;


    }

    public SuitEnum getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", suit=" + suit +
                '}';
    }
}


