package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.Random;
import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {
        playBlackjack();

    }
    public static void playBlackjack() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // Create a deck and shuffle it
        Deck deck = new Deck();

        // Get player's name and create Player objects
        System.out.println("Enter your name: ");
        String playerName = sc.nextLine();
        Player player = new Player();
        player.name = playerName;

        // Create the computer player
        Player computer = new Player();
        computer.name = "Computer";

        // Set player's and computer's pot values
        player.setPotValue(50);
        computer.setPotValue(50);

        // Player places a bet
        System.out.println(player.name + ", enter your bet: ");
        int playerBet = sc.nextInt();
        while (playerBet > player.potValue) {
            System.out.println("You don't have enough pot value. Enter a smaller bet: ");
            playerBet = sc.nextInt();
        }
        player.potValue -= playerBet;

        // Computer places a random bet (between 1 and half its current pot value)
        int computerBet = random.nextInt(computer.potValue / 2) + 1; // Random bet from 1 to half of computer's pot value
        System.out.println(computer.name + " has placed a bet of: " + computerBet);

        // Deal two cards to each player
        deck.deal(player);
        deck.deal(player);
        deck.deal(computer);
        deck.deal(computer);

        // Show player's hand
        System.out.println(player.name + ", your hand is " + player.hand.getHandValue() + " (" + player.hand.getCards() + ")");

        if(player.hand.getHandValue() == 21) {
            System.out.println("Blackjack! You win!");
            System.out.println("Computer's hand: " + computer.hand.getHandValue() + " (" + computer.hand.getCards() + ")");
            return;
        }
        if(computer.hand.getHandValue() == 21) {
            System.out.println("Blackjack! You lose!");
            System.out.println("Computer's hand: " + computer.hand.getHandValue() + " (" + computer.hand.getCards() + ")");
            return;
        }
        // Player turn
        String answer;
        while (true) {
            System.out.println("Do you want another card? (yes/no)");
            answer = sc.nextLine();

            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                deck.deal(player);
                System.out.println("Your hand is now " + player.hand.getHandValue() + " (" + player.hand.getCards() + ")");
                if (player.hand.isBusted()) {
                    System.out.println("You busted!");
                    break;
                }
            } else {
                break;
            }
        }

        // Computer's turn based on AI logic
        while (computer.computerAI()) {
            System.out.println("Computer decides to take another card.");
            deck.deal(computer);
            if (computer.hand.isBusted()) {
                System.out.println("Computer busted!");
                break;
            }
        }

        if (!computer.hand.isBusted()) {
            System.out.println("Computer stays with hand value: " + computer.hand.getHandValue());
        }

        // End game: Print both hands and declare result
        System.out.println("\n" + player.name + "'s hand: " + player.hand.getHandValue() + " (" + player.hand.getCards() + ")");
        System.out.println("Computer's hand: " + computer.hand.getHandValue() + " (" + computer.hand.getCards() + ")");

        if (player.hand.isBusted() && computer.hand.isBusted()) {
            System.out.println("Both players busted! It's a tie.");
        } else if (player.hand.isBusted()) {
            System.out.println("You busted! Computer wins.");
        } else if (computer.hand.isBusted()) {
            System.out.println("Computer busted! You win.");
        } else if (player.hand.getHandValue() > computer.hand.getHandValue()) {
            System.out.println("Congratulations " + player.name + ", you win!");
        } else if (computer.hand.getHandValue() > player.hand.getHandValue()) {
            System.out.println("Computer wins.");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
