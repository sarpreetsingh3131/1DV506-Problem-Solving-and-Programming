using System;

class BMI
{
	public static void Main(string[] args)
	{
		Console.Write("Give your length in meters: ");
		double length = Convert.ToDouble(Console.ReadLine());
		Console.Write("Give your weight in kilograms: ");
		double weight = Convert.ToDouble(Console.ReadLine());
		Console.WriteLine("You BMI is:  " + Math.Round(weight / (length * length)));
	}
}
