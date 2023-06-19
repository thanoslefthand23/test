package studentlist;

/**
 *
 * @author harsh
 */
public class PartTimestd {
    public enum Suit{HEARTS,CLUBS,SPADES,DIAMONDS};
    public enum Value{ACE,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING};

	private Value value;
	private Suit suit;

  
        public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;

	}
        public Value getValue() {
	return this.value;
    
    }

	
	public void setValue(Value value) {
		this.value = value;
	}

	public Suit getSuit() {
		return this.suit;
	}

	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
}
