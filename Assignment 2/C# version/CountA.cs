using System;

class CountA
{
	public static void Main(string[] args)
	{
		Console.Write("Provide a line of text: ");
		string input = Console.ReadLine();
		int smallA = 0;
		int bigA = 0;

		for (int i = 0; i < input.Length; i++)
		{
			if (input[i] == 'a')
			{
				smallA++;
			}
			else if (input[i] == 'A')
			{
				bigA++;
			}
		}
		Console.WriteLine("Number of 'a': " + smallA);
		Console.WriteLine("Number of 'A': " + bigA);
	}
}

