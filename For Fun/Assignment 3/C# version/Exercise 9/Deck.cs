using System;
using System.Collections.Generic;
using System.Linq;
using Card;

public class Deck
{
		private List<Card> deck;

		public Deck()
		{
			deck = new List<Card>();

			for (int suit = 0; suit < (int)Card.Suit.Count; suit++)
			{
				for (int rank = 0; rank < (int)Card.Rank.Count; rank++)
				{
					deck.Add(new Card((Card.Suit)suit, (Card.Rank)rank));
				}
			}
		}

		public void shuffle()
		{
			if (deck.Count != 52)
			{
				Console.Write("Cannot shuffle. Deck contains " + deck.Count + " cards.");
				return;
			}
			Random r = new Random();
			for (int i = 0; i < 1000; i++)
			{
				int ix = r.Next(deck.Count);
				Card c = deck.ElementAt(ix);
				deck.RemoveAt(ix);
				deck.Add(c);
			}
		}

		public int size()
		{
			return deck.Count;
		}

		public Card dealCard()
		{
			if (deck.Count <= 0)
			{
				Console.WriteLine("Cannot deal.Deck is empty!");
				return null;
			}
			Card c = deck.First();
			deck.RemoveAt(0);
			return c;
		}
	}