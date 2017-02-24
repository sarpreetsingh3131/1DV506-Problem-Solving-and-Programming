using System;
using Assignment1;

class PointMain
{
	public static void Main(string[] args)
	{
		Point p1 = new Point();
		Point p2 = new Point(3, 4);
		Console.WriteLine(p1.toString());
		Console.WriteLine(p2.toString());
		if (p1.isEqualTo(p2))
			Console.WriteLine("The two points are equal");
		double dist = p1.distanceTo(p2);
		Console.WriteLine("Point Distance: " + dist);
		p2.move(5, -2);
		p1.moveToXY(8, 2);
		if (p1.isEqualTo(p2))
			Console.WriteLine("The two points are equal");
	}
}