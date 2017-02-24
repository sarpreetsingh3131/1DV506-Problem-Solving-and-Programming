package sb223ce_assign3;

public class Point {

	
	
	private int x; // create field variables
	private int y;

	
	
	
	public Point() { // create empty constructor
	}

	
	
	
	public Point(int a, int b) { // create constructor with parameters

		x = a; // give parameter values to field variables
		y = b;
	}

	
	
	
	public Point(Point p) {   // other Constructor for comparing two Point equation
		x = p.x; /* give new constructor param variables values to field
					      variables**/
		y = p.y;
	}

	
	
	
	public String toString() { // method syntax
		return "(" + x + "," + y + ")"; // return string
	}

	
	
	
	public int getX() { // method syntax
		return x; // return value to field variable
	}

	
	
	
	public int getY() { // method syntax
		return y; // return value to field variable
	}

	
	
	
	public boolean isEqualTo(Point p) { // method syntax

		return x == p.getX() && y == p.getY(); // return true or false
	}

	
	
	
	public double distanceTo(Point p) { // method syntax

		int x2 = p.getX(); // create two integer variable for saving param
							// variable values
		int y2 = p.getY();

		double distance;
		distance = Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2)); // use
																			// distance
																			// formula
		return distance; // return distance 
	}

	
	
	
	public void move(int a, int b) { // method syntax
		x = x + (a); /*add or subtract the value of field variable according to parameter
						 variable values**/
		y = y + (b);
	}// no return, because it is void method

	
	
	
	public void moveToXY(int a, int b) { // method syntax
		x = a; // move the field variables as given param variable value
		y = b;

	}// no return, because it is void method

}
