import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Liam Lokaisingh
 */
public class Player {
    private String name;
    private Queue<Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new LinkedList<>();
    }

    public String getName() {
        return name;
    }
    
    public void addToHand (Card card) {
        hand.add(card);
    }
    
    public Card playCard() {
        return hand.poll();
    }
    
    public boolean hasCards() {
        return !hand.isEmpty();
    }
}
