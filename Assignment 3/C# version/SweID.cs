using System;
using System.Linq;

class SweID
{
	public static void Main(string[] args)
	{
		Console.Write("Type your Personal Number (YYMMDD-NNNN): ");
		string input = Console.ReadLine();
		Console.WriteLine("First Part: " + getFirstPart(input));
		Console.WriteLine("Second Part: " + getSecondPart(input));
		Console.WriteLine("Is Male: " + isMale(input));
		Console.WriteLine("Is Female: " + isFemale(input));
		Console.WriteLine("Is Correct: " + isCorrect(input));
	}

	public static string getFirstPart(string input)
	{
		return input.Substring(0, input.IndexOf('-'));
	}

	public static string getSecondPart(string input)
	{
		return input.Substring(input.IndexOf('-') + 1);
	}

	public static bool isFemale(string input)
	{
		return Convert.ToInt32(input.ElementAt(input.Length - 2)) % 2 == 0;
	}

	public static bool isMale(string input)
	{
		return Convert.ToInt32(input.ElementAt(input.Length - 2)) % 2 != 0;
	}

	public static bool isCorrect(string input)
	{
		int year = Convert.ToInt32(input.Substring(0, 2));
		int month = Convert.ToInt32(input.Substring(2, 2));
		int date = Convert.ToInt32(input.Substring(4, 2));

		if (month != 2 && month <= 12 && month >= 1 && date <= 31 && date >= 1)
		{
			if (month % 2 != 0 && month <= 7 || month % 2 == 0 && month >= 8)
			{
				return count(getFirstPart(input) + getSecondPart(input)) == (int)Char.GetNumericValue(input.Last());
			}
			else if (date <= 30)
			{
				return count(getFirstPart(input) + getSecondPart(input)) == input.Last();
			}
		}
		else if (month == 2 && year % 4 == 0 && date <= 29 || month == 2 && year % 4 != 0 && date <= 28)
		{
			return count(getFirstPart(input) + getSecondPart(input)) == input.Last();
		}
		return false;
	}

	private static int count(string input)
	{
		int sum = 0;
		int temp = 0;
		for (int i = 1; i <= input.Length - 1; i++)
		{
			if (i % 2 != 0)
			{
				temp = (int)Char.GetNumericValue(input[i - 1]) * 2;
			}
			else
			{
				temp = (int)Char.GetNumericValue(input[i - 1]);
			}
			if (temp > 9)
			{
				sum += temp % 10;
				temp /= 10;
			}
			sum += temp;
		}
		return 10 - sum % 10;
	}
}