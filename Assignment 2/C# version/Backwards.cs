using System;

class Backwards
{
	public static void Main(string[] args)
	{
		Console.Write("Provide a line of text: ");
		string input = Console.ReadLine();

		Console.Write("Backwards: ");
		for (int i = input.Length - 1; i >= 0; i--)
		{
			Console.Write(input[i]);
		}
	}
}

