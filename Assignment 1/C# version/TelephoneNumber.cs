using System;

class TelephoneNumber
{
	public static void Main(string[] args)
	{
		Random ran = new Random();
		Console.WriteLine("Random telephone number: 0" + +ran.Next(10) + ran.Next(10) + ran.Next(10) + "-"
						  + (ran.Next(9) + 1) + ran.Next(10) + ran.Next(10) + ran.Next(10) + ran.Next(10)
						  + ran.Next(10));
	}
}

