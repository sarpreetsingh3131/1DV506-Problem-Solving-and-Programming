using System;
using Assignment1;

class main
{
	public static void Main(string[] args)
	{
		Deck deck = new Deck();

		Console.WriteLine("Size: " + deck.size());
		deck.shuffle();

		for (int i = 0; i < 10; i++)
		{
			Console.WriteLine(deck.dealCard());
		}

		Console.WriteLine("Size: " + deck.size());
		deck.shuffle();
	}
}