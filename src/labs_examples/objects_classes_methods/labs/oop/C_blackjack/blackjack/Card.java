package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

public class Card {
    static char [] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;

    public Card(char suit, int cardValue) {
        this.suit = new char[]{suit};
        this.cardValue = cardValue;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
}
