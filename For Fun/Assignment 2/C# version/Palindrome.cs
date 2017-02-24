using System;

class Palindrome
{
	public static void Main(string[] args)
	{
		Console.WriteLine("Enter a line of text: ");
		string input = Console.ReadLine();
		string onlyLetters = "";
		string reverse = "";

		for (int i = 0; i < input.Length; i++)
		{
			if (Char.IsLetter(input[i]))
			{
				onlyLetters += input[i];
			}
		}

		for (int i = onlyLetters.Length - 1; i >= 0; i--)
		{
			reverse += onlyLetters[i];
		}

		Console.WriteLine("Is palindrome: " + reverse.ToLower().Equals(onlyLetters.ToLower()));
	}
}