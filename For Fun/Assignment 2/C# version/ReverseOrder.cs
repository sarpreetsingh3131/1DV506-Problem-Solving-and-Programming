using System;
using System.Collections;
using System.Runtime.Remoting.Metadata.W3cXsd2001;
using System.Collections.Generic;

class ReverseOrder
{
	public static void Main(string[] args)
	{
		List<int> list = new List<int>();
		Console.WriteLine("Enter positive integers. End by giving a negative integer.");

		int counter = 0;
		int input = 0;

		while (input >= 0)
		{
			Console.Write("Integer " + (++counter) + ": ");
			input = Convert.ToInt32(Console.ReadLine());
			if (input >= 0)
			{
				list.Add(input);
			}
		}

		Console.WriteLine("Number of positive integers: " + list.Count);
		Console.Write("In reverse order: ");

		for (int i = list.Count - 1; i >= 0; i--)
		{
			Console.Write(list[i] + "  ");
		}
	}
}