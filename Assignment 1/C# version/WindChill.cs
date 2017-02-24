using System;

class WindChill
{
	public static void Main(string[] args)
	{
		Console.Write("Temperature: ");
		double temperature = Convert.ToDouble(Console.ReadLine());
		Console.Write("Wind speed: ");
		double windSpeed = Convert.ToDouble(Console.ReadLine());
		double windChill = 33 + (temperature - 33) * (0.474 + 0.454 * Math.Sqrt(windSpeed) - 0.0454 * windSpeed);
		Console.WriteLine("Wind Chill Temperature: " + string.Format("{0:0.0}", windChill));
	}
}

