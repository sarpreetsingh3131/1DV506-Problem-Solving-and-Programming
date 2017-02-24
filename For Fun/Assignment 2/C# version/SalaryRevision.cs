using System;
using System.Collections.Generic;
using System.Linq;

class SalaryRevision
{
	public static void Main(string[] args)
	{
		List<int> salaries = new List<int>();
		int sum = 0;

		Console.Write("Provide salaries (and terminate input with 'X'): ");
		string input = "";


		while (!input.Equals("X"))
		{
			input = Console.ReadLine();
			if (!input.Equals("X"))
			{
				salaries.Add(Convert.ToInt32(input));
				sum += Convert.ToInt32(input);
			}
		}
		salaries.Sort();

		if (salaries.Count % 2 != 0)
		{
			Console.WriteLine("Median: " + salaries.ElementAt(salaries.Count / 2));
		}
		else
		{
			double median = salaries.ElementAt((salaries.Count / 2)) + salaries.ElementAt((salaries.Count / 2) - 1);
			Console.WriteLine("Median: " + Math.Round(median / 2));
		}
		Console.WriteLine("Average: " + (sum / salaries.Count));
		Console.WriteLine("Gap: " + (salaries.ElementAt(salaries.Count - 1) - salaries.ElementAt(0)));
	}
}
