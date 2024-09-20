package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {
        playBlackjack();

    }
    public static void playBlackjack() {
        Deck deck = new Deck();
        Player player = new Player();
        Player computer = new Player();
        Scanner sc = new Scanner(System.in);
        deck.deal(player);
        deck.deal(player);
        deck.deal(computer);
        deck.deal(computer);
        System.out.println("Your hand is " + player.hand.getHandValue());
        System.out.println("Do you want another card?");
        String answer = sc.nextLine();
        while (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            deck.deal(player);
            System.out.println("Your hand is " + player.hand.getHandValue());
            if (player.hand.isBusted()) {
                System.out.println("You busted!");
                break;
            }
            System.out.println("Do you want another card?");
            answer = sc.nextLine();
        }
        System.out.println("Your hand is " + player.hand.getHandValue());
        if (player.hand.isBusted()) {
            System.out.println("You busted!");
        }
    }
}
