using System;

class BirthdayCandles
{
	public static void Main(string[] args)
	{
		int box = 24;
		int totalBoughtBoxes = 0;
		int remainingCandles = 0;

		for (int i = 1; i <= 100; i++)
		{
			int counter = 0;

			while (remainingCandles < i)
			{
				remainingCandles += box;
				counter++;
			}
			if (counter != 0)
			{
				Console.WriteLine("Before birthday " + i + ", buy " + counter + " box(es)");
			}

			remainingCandles -= i;
			totalBoughtBoxes += counter;
			counter = 0;
		}
		Console.WriteLine("Total number of boxes: " + totalBoughtBoxes + ", Remaining candles: " + remainingCandles);
	}
}