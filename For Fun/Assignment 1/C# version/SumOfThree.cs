using System;

class SumOfThree
{
	public static void Main(string[] args)
	{
		Console.Write("Provide a three digit number:  ");
		int input = Convert.ToInt32(Console.ReadLine());
		int sum = 0;
		int sum = input % 10;
		input /= 10;
		sum += input % 10;
		sum += input / 10;
		Console.WriteLine("Sum of digits: " + sum);
	}
}
