package sb223ce_assign4;

import java.util.Random;

public class RandomWalk {

	/* Field variables */

	private int x;
	private int y;
	private int maxSteps;
	private int sizeOfPlane;
	private int stepsTaken;

	/* Constructor and initializing the field variables */

	public RandomWalk() {
		x = 0;
		y = 0;
		maxSteps = 0;
		sizeOfPlane = 0;
		stepsTaken = 0;
	}

	/* Another constructor with parameters */

	public RandomWalk(int max, int size) {
		if(check(max, size) == true){
		maxSteps = max;
		sizeOfPlane = size;
		}
		else
			System.err.println("Please provide postive integers.");
	}

	public int getX() {
		return x; // return the position of x
	}

	public int getY() {
		return y; // return the position of y
	}

	public String toString() {
		String position = "X-Y co-ordinates: " + "(" + x + "," + y + ")\n" + "Number of Steps taken: " + stepsTaken;
		return position;

		/*
		 * Return string which will show x and y position and steps taken so far
		 */
	}

	public void takeStep() {

	/* If inBounds and moreSteps methods are true, then run
	 * the random generator class. If the number is 0 or 1,
	 * then y will move and while 2 and 3 x will move. Because
	 * according to graph up and down(vertical axis) is y and
	 * (horizontal axis) is x. 
	 */
		
		if (moreSteps() && inBounds() == true) {
			Random rand = new Random();
			int ran = rand.nextInt(4);
			int up = 0;
			int down = 1;
			int left = 2;
			if (ran == up) {
				y = y + 1;
			} else if (ran == down) {
				y = y - 1;
			} else if (ran == left) {
				x = x - 1;
			} else
				x = x + 1;
			stepsTaken = stepsTaken + 1;  // add 1 in steps
	
		}

	}

	public boolean moreSteps() {

		return stepsTaken < maxSteps;  // return if steps taken so far are less than total steps.
	}

	public boolean inBounds() {

		return x <= sizeOfPlane && x >= -sizeOfPlane && y <= sizeOfPlane && y >= -sizeOfPlane;
	
	/* return if x and y are inside or on the boundary. In this, I also compare negatives
	 * because the according to question plane x and y coordinates can vary from -k to k.
	 */
	
	}

	public void walk() {
		
		/* Until moresteps and inbounds methods are true repeat the takesteps method.
		 */
		while (moreSteps() && inBounds() != false) {
			takeStep();
		}

	}

private boolean check(int a, int b){
	return a > 0 && b > 0;
}


}
