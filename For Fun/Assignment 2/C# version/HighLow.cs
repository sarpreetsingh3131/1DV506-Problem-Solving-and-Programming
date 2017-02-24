using System;

class HighLow
{
	public static void Main(string[] args)
	{
		int randomNumber = new Random().Next(100) + 1;
		int guess = 0;
		Console.WriteLine("Guess a number between 1-100 in 10 turns");

		for (int i = 1; i <= 10; i++)
		{
			Console.Write("Guess " + i + ": ");
			guess = Convert.ToInt32(Console.ReadLine());

			if (guess == randomNumber)
			{
				Console.WriteLine("Correct answer after only " + i + " guesses – Excellent!");
				break;
			}
			else if (guess < randomNumber)
			{
				Console.WriteLine("Clue: higher");
			}
			else
			{
				Console.WriteLine("Clue: lower");
			}
		}
		if (guess != randomNumber)
		{
			Console.WriteLine("Correct answer is " + randomNumber);
		}
	}
}
