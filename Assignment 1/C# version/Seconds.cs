using System;

class Seconds
{
	public static void Main(string[] args)
	{
		Console.Write("Hours: ");
		int hours = Convert.ToInt32(Console.ReadLine());
		Console.Write("Minutes: ");
		int minutes = Convert.ToInt32(Console.ReadLine());
		Console.Write("Seconds: ");
		int seconds = Convert.ToInt32(Console.ReadLine());
		Console.WriteLine("Total time measured in seconds: " + ((hours * 3600) + (minutes * 60) + seconds));
	}
}
