using System;

class CountDigits
{
	public static void Main(string[] args)
	{
		Console.Write("Provide a positive integer: ");
		int input = Convert.ToInt32(Console.ReadLine());

		int odds = 0;
		int zeros = 0;
		int evens = 0;

		while (input != 0)
		{
			int temp = input % 10;

			if (temp == 0)
			{
				zeros++;
			}
			else if (temp % 2 == 0)
			{
				evens++;
			}
			else
			{
				odds++;
			}
			input /= 10;
		}

		Console.WriteLine("Zeros: " + zeros);
		Console.WriteLine("Odd: " + odds);
		Console.WriteLine("Even: " + evens);
	}
}