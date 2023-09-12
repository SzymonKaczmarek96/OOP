package Cards;

public class CompareCards {

    public Card CompareTwoCards(Card card1, Card card2) {

        if(card1.checkPowerCard() > card2.checkPowerCard()) {
            return card1;
        }else if (card1.checkPowerCard() == card2.checkPowerCard()) {

            System.out.println("Draw");
        }

        return card2;

    }

}
