using System;

class Reverse
{
	public static void Main(string[] args)
	{
		char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 's', 'i', 'h', 'T' };

		foreach (char c in text)
		{
			Console.Write(c);
		}

		for (int i = 0; i < text.Length / 2; i++)
		{
			char temp = text[i];
			text[i] = text[text.Length - 1 - i];
			text[text.Length - 1 - i] = temp;
		}

		Console.WriteLine();
		foreach (char c in text)
		{
			Console.Write(c);
		}
	}
}