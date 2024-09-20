package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.ArrayList;

public class Deck {
    Card[] cards;
    ArrayList<Integer> usedCards;

    public Deck() {
        cards = new Card[52];
        usedCards = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards[i*13 + j] = new Card((char)('A' + j), i);
            }
        }
    }
    public void deal(Player player) {

        int index = (int) (Math.random() * 52);
        while (usedCards.contains(index)) {
            index = (int) (Math.random() * 52);
        }
        usedCards.add(index);
        player.getHand().addCard(cards[index]);
    }

}
