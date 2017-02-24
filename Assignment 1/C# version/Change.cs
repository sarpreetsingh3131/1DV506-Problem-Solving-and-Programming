using System;

class Change
{
	public static void Main(string[] args)
	{
		Console.Write("Price:  ");
		double price = Convert.ToDouble(Console.ReadLine());
		Console.Write("Payment:  ");
		double payment = Convert.ToDouble(Console.ReadLine());
		int change = (int)Math.Round(payment - price);
		Console.Console.WriteLine("Change: " + change + " kronor");
		Console.WriteLine("1000kr bills: " + (change / 1000));
		change %= 1000;
		Console.WriteLine("500kr bills: " + (change / 500));
		change %= 500;
		Console.WriteLine("100kr bills: " + (change / 100));
		change %= 100;
		Console.WriteLine("50kr bills: " + (change / 50));
		change %= 50;
		Console.WriteLine("20kr bills: " + (change / 20));
		change %= 20;
		Console.WriteLine("10kr bills: " + (change / 10));
		change %= 10;
		Console.WriteLine("5kr bills: " + (change / 5));
		change %= 5;
		Console.WriteLine("1kr bills: " + change);
	}
}
