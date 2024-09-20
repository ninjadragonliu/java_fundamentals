package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

public class Card {
    private char suit; // Non-static, as each card has its own suit
    private int cardValue; // Value of the card (1-13)

    // Constructor to initialize suit and card value
    public Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    // Getter for suit
    public char getSuit() {
        return suit;
    }

    // Setter for suit (optional, if needed)
    public void setSuit(char suit) {
        this.suit = suit;
    }

    // Getter for card value
    public int getCardValue() {
        // Return 10 for Jack, Queen, King (values 11, 12, 13)
        if (cardValue > 10) {
            return 10;
        }
        return cardValue;
    }

    // Setter for card value (optional, if needed)
    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
    // Override toString() method to print card details nicely
    @Override
    public String toString() {
        String valueStr;
        // Translate 11, 12, 13 to Jack, Queen, King
        switch (cardValue) {
            case 11:
                valueStr = "Jack";
                break;
            case 12:
                valueStr = "Queen";
                break;
            case 13:
                valueStr = "King";
                break;
            case 1:
                valueStr = "Ace"; // Handle Ace if needed
                break;
            default:
                valueStr = String.valueOf(cardValue);
        }
        return suit + " " + valueStr;
    }
}
