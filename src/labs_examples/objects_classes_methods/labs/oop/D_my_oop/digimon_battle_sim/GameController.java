package labs_examples.objects_classes_methods.labs.oop.D_my_oop.digimon_battle_sim;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameController {
    public static void main(String[] args) {
        System.out.println("Starting game...");
        startGame();
    }
    public static void startGame() {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Action> actions = new ArrayList<>();
        actions.add(new Action("Attack"));
        actions.add(new Action("Defend"));
        actions.add(new Action("Digivolve"));

        Digimon playerDigimon = chooseDigimon(sc);


        // Game assigns a random enemy Digimon
        Digimon enemyDigimon;
        if (rand.nextBoolean()) {
            enemyDigimon = new Agumon();
        } else {
            enemyDigimon = new Gabumon();
        }
        System.out.println("You chose: " + playerDigimon.getName());
        System.out.println("Your opponent is: " + enemyDigimon.getName());

        // Main battle loop
        while (playerDigimon.getHp() > 0 && enemyDigimon.getHp() > 0) {
            // Player's turn
            System.out.println("Choose your action:");
            for(int i = 0; i < actions.size(); i++) {
                System.out.println((i + 1) + ". " + actions.get(i).getName());
            }
            int actionChoice = sc.nextInt();
            String action = actions.get(actionChoice - 1).getName();
            if(action.equalsIgnoreCase("digivolve")) {
                playerDigimon = playerDigimon.digivolve();
                continue;
            }
            if(action.equalsIgnoreCase("attack")) {
                for (int i = 0; i < playerDigimon.getAttacks().size(); i++) {
                    System.out.println((i + 1) + ". " + playerDigimon.getAttacks().get(i).getName());
                }

                int attackChoice = sc.nextInt();
                Attack chosenAttack = playerDigimon.getAttacks().get(attackChoice - 1);
                System.out.println(playerDigimon.getName() + " uses " + chosenAttack.getName() + "!");
                playerDigimon.attack(enemyDigimon, chosenAttack);
                // Check if enemy is defeated
                if (enemyDigimon.getHp() <= 0) {
                    System.out.println(enemyDigimon.getName() + " has been defeated! You win!");
                    break;
                }
            }
            if(action.equalsIgnoreCase("defend")) {
                playerDigimon.defend();
            }
            // Enemy's turn
            System.out.println("Enemy's turn...");
            Attack enemyAttack = enemyDigimon.getAttacks().get(rand.nextInt(enemyDigimon.getAttacks().size()));
            System.out.println(enemyDigimon.getName() + " uses " + enemyAttack.getName() + "!");
            enemyDigimon.attack(playerDigimon, enemyAttack);

            // Check if player is defeated
            if (playerDigimon.getHp() <= 0) {
                System.out.println(playerDigimon.getName() + " has been defeated! You lose.");
                break;
            }

            // Optionally, show current HP after each round
            System.out.println("Current HP: " + playerDigimon.getName() + " (" + playerDigimon.getHp() + ") | " +
                    enemyDigimon.getName() + " (" + enemyDigimon.getHp() + ")");
        }

        System.out.println("Game Over.");
    }
    private static Digimon chooseDigimon(Scanner sc) {

        System.out.println("Choose your Digimon: Agumon or Gabumon");
        String playerChoice = sc.nextLine();


        if (playerChoice.equalsIgnoreCase("Agumon")) {
            return new Agumon();
        } else if (playerChoice.equalsIgnoreCase("Gabumon")) {
            return new Gabumon();
        } else {
            System.out.println("Invalid choice! Defaulting to Agumon.");
            return new Agumon();
        }


    }

}
