package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

public class Card {
    char [] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;

    public Card(char c, int cardValue) {
        this.cardValue = cardValue;
    }
}
