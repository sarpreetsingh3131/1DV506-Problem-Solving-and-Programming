using System;
using System.Collections.Generic;
using System.Linq;

class Triangle
{
	public static void Main(string[] args)
	{
		Console.Write("Provide an odd positive integer: ");
		int input = Convert.ToInt32(Console.ReadLine());

		if (input % 2 == 0 || input < 0)
		{
			Console.WriteLine("Intger should be odd and positive");
			System.Environment.Exit(0);
		}

		Console.WriteLine("Right - Angled Triangle: ");
		for (int i = 1; i <= input; i++)
		{
			for (int j = i; j <= input; j++)
			{
				Console.Write(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				Console.Write("*");
			}
			Console.WriteLine();
		}

		Console.WriteLine("Isosceles Triangle: ");
		for (int i = 1; i <= input; i += 2)
		{
			int numOfStars = i;
			int spaces = (input - i) / 2;
			for (int j = 1; j <= spaces; j++)
			{
				Console.Write(" ");
			}
			for (int k = 1; k <= numOfStars; k++)
			{
				Console.Write("*");
			}
			for (int l = 1; l <= spaces; l++)
			{
				Console.Write(" ");
			}
			Console.WriteLine();
		}
	}
}