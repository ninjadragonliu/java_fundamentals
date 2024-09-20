package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;
    int handValue;

    public Hand() {
        cards = new ArrayList<Card>();
        handValue = 0;
    }

    public void addCard(Card card) {
        cards.add(card);
        handValue += card.cardValue;
    }

    public boolean isBusted() {
        return handValue > 21;
    }

    public int getHandValue() {
        return handValue;
    }
}
