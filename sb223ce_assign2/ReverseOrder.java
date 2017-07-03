package sb223ce_assign2;

import java.util.Scanner;
import java.util.ArrayList;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer. End by giving negative integer.");
		ArrayList<Integer> number = new ArrayList<Integer>();

		/*As we do not know how many integers user will input, so we use 'do'
		 * statement and save the integers in array list until negative integer
		 * has been provide.*/

		int input;
		do {

			input = scan.nextInt();

			if (input >= 0) {
				number.add(input);
			}
		} while (input > -1);

		System.out.println("PostiveInteger: " + (number.size()));

		System.out.print("In reverese order: ");

		/*For reversing we run loop from last index.*/

		for (int i = number.size() - 1; i >= 0; i--) {

			System.out.print((number.get(i)) + " ");
			/* used space to differentiate the integers */

		}

		scan.close();
	}

}