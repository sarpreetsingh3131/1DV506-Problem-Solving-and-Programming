namespace Assignment1
{
	public class Card
	{
		public enum Suit { Hearts, Clubs, Diamonds, Spades, Count }
		public enum Rank { Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Count }

		private Suit suit;
		private Rank rank;


		public Card(Suit suit, Rank rank)
		{
			this.suit = suit;
			this.rank = rank;
		}

		public Suit getSuit()
		{
			return suit;
		}

		public Rank getRank()
		{
			return rank;
		}

		public override string ToString()
		{
			return rank + " of " + suit;
		}
	}
}