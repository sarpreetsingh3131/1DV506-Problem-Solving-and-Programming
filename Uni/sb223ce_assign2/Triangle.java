package sb223ce_assign2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/* User instruction */
		System.out.print("Provide an odd positive integer: ");
		int input = scan.nextInt();
		scan.close();

		/*According to question instruction, we must only accept positive odd
		 * integer*/
		if (input % 2 <= 0) {
			System.out.println("Error: The given integer is not an odd positive integer");
		}

		else {
			System.out.println("Right-Angled Triangle:");

			for (int i = 0; i < input; i++) {
				for (int j = input; j > 0; j--) {
					if (j > i) {
						System.out.print(" "); /*we leave space otherwise triangle
										       * will be on right side. */
					} else {
						System.out.print("*");
					}

				}

				System.out.print("*");

				System.out.println(); /* To separate the stars after each loop */
			}

		

		/*we will start from 1 and add 2 in it because we only need to print
		 * odd lines*/
		System.out.println("Isosceles Triangle:");
         for (int i = 1; i <= input; i += 2) {
			for (int j = input; j >= 1; j--) {
				if (j <= i) {
					System.out.print("*" + " "); /*Need spaces, otherwise
												 * triangle will move to right.*/
				} else {
					System.out.print(" "); /*Need spaces, otherwise triangle
											 * will move to right.*/
				}

			}

			System.out.print(" ");          /* To skip the stars in even line from j loop */

			System.out.println(); /* To separate the stars after each loop */
		}
		}

	}

}
