import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Card> deck = new LinkedList();

        for (int i = 2; i < 15; i++) {
            deck.add(new Card(Suit.SPADES, i));
            deck.add(new Card(Suit.HEARTS, i));
            deck.add(new Card(Suit.CLUBS, i));
            deck.add(new Card(Suit.DIAMONDS, i));
        }
        Collections.sort(deck,Card::compareTo);
        for (Card c : deck) {
            System.out.println(c);
        }

    }
}
