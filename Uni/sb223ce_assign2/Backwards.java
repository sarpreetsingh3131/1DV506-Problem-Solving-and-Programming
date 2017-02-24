package sb223ce_assign2;

import java.util.Scanner;

public class Backwards {

	public static void main(String[] args) {

		/*User instruction*/
		Scanner scan = new Scanner(System.in);
		System.out.print("type a line: ");
		String input = scan.nextLine();

		/*For reversing the string, we need for loop which we start from
		 * string total length - 1 because string start from 0; and then end the
		 * loop at 0. we will save the character of string at position 'i'(which
		 * will change while loop runs) in char ch and then print it within
		 * the loop. */

		char ch;

		for (int i = input.length() - 1; i >= 0; i--) {

			ch = input.charAt(i);

			System.out.print(ch);
		}

		scan.close();

	}
}
