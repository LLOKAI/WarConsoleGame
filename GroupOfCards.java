import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Liam Lokaisingh
 */
public class GroupOfCards {
    private ArrayList<Card> cards;
    
    public GroupOfCards() {
        cards = new ArrayList<>();
    }
    public ArrayList<Card> getCards() {
        return cards;
    }
    
    public void addCard(Card card) {
        cards.add(card);
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }
    
    public void resetDeck() {
        ArrayList<Card> newDeck = new ArrayList<>(cards);
        cards.clear();
        cards.addAll(newDeck);
        shuffle();
    }    
}
