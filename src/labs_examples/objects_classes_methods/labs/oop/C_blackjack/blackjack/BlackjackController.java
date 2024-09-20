package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

public class BlackjackController {

    public static void main(String[] args) {
        playBlackjack();

    }
    public static void playBlackjack() {
        Deck deck = new Deck();
        Player player = new Player();
        Player computer = new Player();

        deck.deal(player);
        deck.deal(player);
        deck.deal(computer);
        deck.deal(computer);
        System.out.println("Your hand is " + player.hand);
    }
}
