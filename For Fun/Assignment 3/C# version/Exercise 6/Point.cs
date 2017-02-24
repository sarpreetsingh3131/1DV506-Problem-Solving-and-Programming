using System;
namespace Assignment1
{
	public class Point
	{
		private int x;
		private int y;

		public Point()
		{
			x = 0;
			y = 0;
		}

		public Point(int x, int y)
		{
			this.x = x;
			this.y = y;
		}

		public string toString()
		{
			return "(" + x + "," + y + ")";
		}

		public bool isEqualTo(Point p)
		{
			return p.x == x && p.y == y;
		}

		public double distanceTo(Point p)
		{
			return Math.Sqrt(Math.Pow(x - p.x, 2) + Math.Pow(y - p.y, 2));
		}

		public void move(int x, int y)
		{
			this.x += x;
			this.y += y;
		}

		public void moveToXY(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}
}