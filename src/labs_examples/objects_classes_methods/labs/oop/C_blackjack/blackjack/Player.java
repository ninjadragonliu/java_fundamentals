package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

public class Player {
    String name;
    Hand hand;
    int potValue;

    public Player() {
        hand = new Hand();
        potValue = 0;
    }
    public boolean computerAI() {
        if(hand.getHandValue() < 16) {
            return true;
        } else {
            return false;
        }
    }
}
