package sb223ce_assign4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DrunkenWalk {

	public static void main(String[] args) {

		/* User Instruction */
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.print("Enter the size: ");
		int size = scan.nextInt();

		System.out.print("Enter the number of steps: ");
		int steps = scan.nextInt();

		System.out.print("Enter the number of walks: ");
		int walk = scan.nextInt();

		scan.close();

		
		int drunk = 0;  // create variable for counting drunk people
		
		/* Run the for loop according to given number of walk. */
		
		for (int i = 0; i < walk; i++) {
			
			RandomWalk a = new RandomWalk(steps, size);  // each time create a new RandomWalk

			a.walk();     // Walk until inbounds or more steps method is true
			
			if (a.moreSteps() || a.inBounds() == false) {   // if those method become false
				drunk++;                                 // add 1 in drunk variable

			}

		}
		
		double percentage = (double) drunk * 100 / walk;  // calculate percentage

		System.out.println(
				"Out of " + walk + " drunk people, " + drunk + " (" +df.format(percentage) + "%) fell into water.");

	}
}