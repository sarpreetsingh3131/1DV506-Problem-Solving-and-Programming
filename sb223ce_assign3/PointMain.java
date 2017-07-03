package sb223ce_assign3;

public class PointMain {

	public static void main(String[] args) {

		// call the constructor

		Point p1 = new Point();
		Point p2 = new Point(3, 4);

		// call the methods
		System.out.println(p1.toString());
		System.out.println(p2.toString());

		if (p1.isEqualTo(p2))
			System.out.println("The two points are equal");

		double dist = p1.distanceTo(p2);
		System.out.println("Point Distance: " + dist);

		p2.move(5, -2);
		p1.moveToXY(8, 2);

		if (p1.isEqualTo(p2))
			System.out.println("The two points are equal");

	}

}
