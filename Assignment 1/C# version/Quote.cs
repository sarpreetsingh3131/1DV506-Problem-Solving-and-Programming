using System;

class Quote
{
	public static void Main(string[] args)
	{
		Console.Write("Write a line of text: ");
		string input = Console.ReadLine();
		Console.WriteLine("Quote: \"" + input + "\"");
	}
}
