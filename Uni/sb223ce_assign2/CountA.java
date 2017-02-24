package sb223ce_assign2;

import java.util.Scanner;

public class CountA {

	public static void main(String[] args) {

		/*User instruction*/
		Scanner scan = new Scanner(System.in);
		System.out.print("Type a line of text: ");
		String input = scan.nextLine();

		/* For finding the number of a and A, we need for loop and start it
		 * from 0 up to the less than length of the string. We cannot start loop
		 * from 1 because string start from index 0. Also we must set the for
		 * loop less than the length of string because 'string.length()' method
		 * will count the length from 1 and so on. If we do so, than we will
		 * loose the char at position 0 and also string index will be out of
		 * range; program will not execute.*/

		char ch;
		int lowercase = 0;
		int uppercase = 0;

		for (int i = 0; i < input.length(); i++) {
			
			ch = input.charAt(i);   /* Character at position i will save in char ch */

			if (ch == 'a')          /* If its 'a' add 1 in lowercase variable */
				lowercase++;

			else if (ch == 'A')     /* If its 'A' add 1 in uppercase variable */
				uppercase++;
		}
		System.out.println("Number of 'a': " + lowercase + "\n" + "Number of 'A': " + uppercase);

		scan.close();
	}
}