package Cards;

public class Card {

    private Rank rank;

    private Suit suit;


    public Card (Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;


    }


    public int checkPowerCard() {

         return rank.getRankValue();

    }


    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }
}
