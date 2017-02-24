using System;

class Distance
{
	public static void Main(string[] args)
	{
		Console.Write("X co-ordinates\nx1 = ");
		int x1 = Convert.ToInt32(Console.ReadLine());
		Console.Write("x2 = ");
		int x2 = Convert.ToInt32(Console.ReadLine());

		Console.Write("\nY co-ordinates\ny1 = ");
		int y1 = Convert.ToInt32(Console.ReadLine());
		Console.Write("y2 = ");
		int y2 = Convert.ToInt32(Console.ReadLine());

		double distance = Math.Sqrt(Math.Pow(x1 - x2, 2) + Math.Pow(y1 - y2, 2));
		Console.WriteLine("Distance : " + string.Format("{0:0.000}", distance));
	}
}
