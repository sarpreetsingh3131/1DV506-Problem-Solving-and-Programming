using System;

class Convert
{
	public static void Main(string[] args)
	{
		Console.Write("Temperature in Fahrenheit: ");
		double input = System.Convert.ToDouble(Console.ReadLine());
		double celcius = Math.Round(((input - 32) * 5) / 9);
		Console.WriteLine("Temperature in Celsius: " + string.Format("{0:0.0}", celcius));
	}
}

