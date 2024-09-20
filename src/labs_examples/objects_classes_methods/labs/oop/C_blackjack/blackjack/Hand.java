package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;
    int handValue;

    public Hand() {
        cards = new ArrayList<>();
        handValue = 0;
    }
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }
    public void addCard(Card card){
        cards.add(card);
        calculateHandValue();
    }
    public boolean isBusted(){
        return handValue > 21;
    }
    // Adjust hand value based on Ace being 1 or 11
    private void calculateHandValue() {
        int totalValue = 0;
        int numAces = 0;

        // First pass: calculate value, treating Aces as 1 for now
        for (Card card : cards) {
            int cardValue = card.getCardValue();
            if (cardValue == 1) {
                numAces++;  // Track the number of Aces
                totalValue += 1;  // Treat Ace as 1 for now
            } else if (cardValue > 10) {
                totalValue += 10;  // Face cards (J, Q, K) are worth 10
            } else {
                totalValue += cardValue;
            }
        }

        // Adjust Aces to 11 if it won't cause a bust
        while (numAces > 0 && totalValue + 10 <= 21) {
            totalValue += 10;  // Upgrade an Ace from 1 to 11
            numAces--;
        }

        handValue = totalValue;
    }
}
