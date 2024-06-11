/**
 *
 * @author Liam Lokaisingh
 */
public class Card {
    private String suit;
    private int value;
    
    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
    
    public int getValue() {
        return value;
    }
}
