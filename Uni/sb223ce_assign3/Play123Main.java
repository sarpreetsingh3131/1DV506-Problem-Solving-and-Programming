package sb223ce_assign3;

import sb223ce_assign3.Card.Rank;

public class Play123Main {

	public static void main(String[] args) {

		int count = 0; // for counting how many times player wins

		for (int i = 0; i < 10000; i++) { // run the loop

			if (play123() == true) { // if player wins add 1 in count variable
			
				count++;
				
			}
		}

		double percent = (double) count * 100 / 10000; // finding winning
														// percent

		System.out.println("Winning probability: " + percent + "%");
	}

	public static boolean play123() { // method syntax

		Deck deckOfCard = new Deck(); // create a deck

		deckOfCard.shuffle(); // shuffle it

		int count = 1; // for counting 1,2,3

		for (int i = 0; i < deckOfCard.sizeOfDeck(); i++) { // run the loop

			Card a = deckOfCard.getCard(i); // get card from index i

			if (a.getRank() == Rank.Ace && count == 1) { // check if it is rank ace
															// while counting 1

				return false;

			}

			if (a.getRank() == Rank.Two && count == 2) { // check if it is rank
																// two while
																// counting 2

				return false;

			}

			if (a.getRank() == Rank.Three && count == 3) { // check if it
																// is rank three while
																// counting 3

				return false;
			}
			if (count == 3) {   // change counting to 2 and 3
				count = 1;
			} else
				count++;

		}

		return true;
	}
}
