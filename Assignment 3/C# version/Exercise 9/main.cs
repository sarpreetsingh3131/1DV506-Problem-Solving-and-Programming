using System;
using Card;
using Deck;
public class main
{
	public static void Main(string[] args)
	{
		int wins = 0;

		for (int i = 0; i < 10000; i++)
		{
			if (!play123())
			{
				break;
			}
			else
			{
				wins++;
			}
		}
		double probability = (double)wins * 100.0 / 10000;
		Console.WriteLine("You win " + wins + " times out of 10000. Your probability is " + probability + " %");
	}

	public static bool play123()
	{
		Deck deck = new Deck();
		deck.shuffle();

		for (int i = 1; i <= 3; i++)
		{
			Card card = deck.dealCard();
			if (i == 1 && card.getRank() == Card.Rank.Ace)
			{
				return false;

			}
			else if (i == 2 && card.getRank() == Card.Rank.Two)
			{
				return false;


			}
			else if (i == 3 && card.getRank() == Card.Rank.Three)
			{
				return false;

			}
		}
		return true;
	}
}