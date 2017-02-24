using System;

class Time
{
	public static void Main(string[] args)
	{
		Console.Write("Give number of seconds: ");
		int seconds = Convert.ToInt32(Console.ReadLine());
		int hours = seconds / 3600;
		seconds -= hours * 3600;
		int minutes = seconds / 60;
		seconds -= minutes * 60;
		Console.WriteLine("This corresponds to: " + hours + " hours " + minutes + " minutes " + seconds + " seconds.");
	}
}

