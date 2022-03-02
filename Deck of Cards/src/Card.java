import java.util.Objects;

public class Card implements Comparable<Card>{
    private Suit suit;
    private int value;
    private String face;
    public Card(){

    }
    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
        if(value < 11){
            face = String.valueOf(value);
        }else{
            switch (value){
                case 11:
                    face = "jack";
                    break;
                case 12:
                    face = "queen";
                    break;
                case 13:
                    face = "king";
                    break;
                case 14:
                    face = "ace";
                    break;
            }
        }
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && Objects.equals(suit, card.suit);
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", value=" + face +
                '}';
    }

    @Override
    public int hashCode() {
        return  (suit + "" + value).hashCode();
    }

    @Override
    public int compareTo(Card o) {
        if(this.getSuit().ordinal() == o.getSuit().ordinal()){
            if(this.getValue() < o.getValue()) {
                return 1;
            }
            else if(this.getValue() > o.getValue()){
                return -1;
            }
            else{
                return 0;
            }
        }
        else if(this.getSuit().ordinal() > o.getSuit().ordinal()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
