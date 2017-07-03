package sb223ce_assign3;

public class Card {

	
	
	// create enum

	public enum Suit {
		Diamonds, Hearts, Clubs, Spades
	}

	public enum Rank {
		Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
	}

	
	
	private Suit suit; // field variables
	private Rank rank;

	
	
	public Card() { // empty constructor

	}

	
	
	public Card(Rank a, Suit b) { // create constructor with parameters
		this.suit = b; // give param variable value to field variables
		this.rank = a;

	}

	
	
	
	public Suit getSuit() { // method syntax
		return suit; // return value to field variable
	}

	
	
	
	public Rank getRank() { // method syntax
		return rank; // return value to field variable
	}

	
	
	
	public String toString() { // method syntax
		return rank + " of " + suit; // return string
	}
}
