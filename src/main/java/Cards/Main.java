package Cards;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card(Rank.TWO,Suit.CLUBS);
        Card card2 = new Card(Rank.THREE,Suit.HEARTS);


        System.out.println(card1);
        System.out.println(card2);


        for (Rank checkRank: Rank.values()){
            System.out.println(checkRank);
        }

        System.out.println(card1.checkPowerCard());

        System.out.println(card2.checkPowerCard());



        CompareCards compareCards = new CompareCards();

        System.out.println(compareCards.CompareTwoCards(card1,card2));;

        ArrayList<Card> spades = new ArrayList<>();

        for(int i=0;i < Rank.values().length; i++){

            spades.add(new Card(Rank.values()[i],Suit.SPADES));

        }

        for (Card cards: spades
             ) {
            System.out.println(cards);
        }

        ArrayList<Card> deck = new ArrayList<>();


        for(Suit suit: Suit.values()){
            for (Rank rank: Rank.values()) {
                deck.add(new Card(rank,suit));
            }

        }

        for(Card deckCards: deck) {
            System.out.println(deckCards);
        }




    }
}