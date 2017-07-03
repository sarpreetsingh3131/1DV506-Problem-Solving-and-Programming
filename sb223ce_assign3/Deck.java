package sb223ce_assign3;

import java.util.ArrayList;
import java.util.Collections;

import sb223ce_assign3.Card.Rank;
import sb223ce_assign3.Card.Suit;

public class Deck {

	// field variables

	private ArrayList<Card> deckOfCard = new ArrayList<>();

	// constructor
	public Deck() {

		for (Suit a : Suit.values()) { // add every value of suit and rank in
										// array list for creating deck
			for (Rank b : Rank.values()) {
				Card c = new Card(b, a);
				deckOfCard.add(c);
			}

		}
	}

	public int sizeOfDeck() { // to find current size of deck
		int n = deckOfCard.size();
		return n;
	}

	public void shuffle() { // method syntax

		// check if deck contains 52 cards

		if (deckOfCard.size() < 52) {
			System.err.println("Cannot shuffle. Deck contains less than 52 cards.");
		}

		Collections.shuffle(deckOfCard); // shuffle the deck

	}

	public Card dealCard() { // method syntax,
     if(deckOfCard.size() == 0){
      System.err.println("Deck have no card left to deal");  // for handling error
    }
		Card card = deckOfCard.get(0); // take card
		deckOfCard.remove(0); // remove the deal card
		return card;
	}

	public Card getCard(int i) { // method syntax
		return deckOfCard.get(i); // get card from specific index in deck
	}

}
