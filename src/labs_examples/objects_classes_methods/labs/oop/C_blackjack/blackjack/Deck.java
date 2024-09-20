package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.ArrayList;

public class Deck {
    Card[] cards;
    ArrayList<Integer> usedCards;

    public Deck() {
        cards = new Card[52];
        usedCards = new ArrayList<>();
    }

    public void createDeck() {
        int cardNum = 0;
        for (char suit : Card.suit) {
            for (int value = 1; value <= 13; value++) {
                cards[cardNum] = new Card(suit, value);
                cardNum++;
            }
        }
    }
}
