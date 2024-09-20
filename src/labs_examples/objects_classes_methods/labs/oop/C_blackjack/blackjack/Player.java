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
        return hand.getHandValue() < 16;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }
}
