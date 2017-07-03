package sb223ce_assign3;



public class PlayCardMain {

	public static void main(String[] args) {

		// create a deck of 52 cards

		Deck deckOfCard = new Deck();

		// call methods

		deckOfCard.shuffle();

		System.out.println(deckOfCard.dealCard());
		System.out.println(deckOfCard.dealCard());
		System.out.println(deckOfCard.dealCard());
		System.out.println(deckOfCard.dealCard());
		System.out.println(deckOfCard.dealCard());
		
		
		deckOfCard.shuffle();

		System.out.println("Left card: " + deckOfCard.sizeOfDeck());

	}

}