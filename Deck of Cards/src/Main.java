import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Card> deck = new LinkedList();
        for (Card c : deck) {
            System.out.println(c);
        }
        Collection.sort(deck);

    }
}
