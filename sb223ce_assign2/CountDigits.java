package sb223ce_assign2;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/* User instruction */
		System.out.print("Provide a positive integer: ");
		int sum = scan.nextInt();

		/* We need 'while' statement because we need to run the loop until its
		 * zero and we cannot find the length of integer. Then, we will take one
		 * integer at one time through 'if' statements.*/

		int zero = 0;
		int even = 0;
		int odd = 0;

		while (sum != 0) {
			int digit = sum % 10; /* Pick last digit */

			if (digit == 0) /*For counting zeros separately*/ 
			{
				zero++;
			} else if (digit % 2 == 0)  /* Even numbers have 0 mode with 2 */
			{
				even++;
			} else {
				odd++;
			}

			sum = sum / 10; /* Remove last digit */
		}

		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
		System.out.println("Zeros: " + zero);

		scan.close();

	}
}
