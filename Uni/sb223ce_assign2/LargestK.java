package sb223ce_assign2;

import java.util.Scanner;

public class LargestK {

	public static void main(String[] args) {

		/* User instruction */
		Scanner scan = new Scanner(System.in);
		System.out.print("Give a positive integer: ");
		int input = scan.nextInt();

		/*For finding the largest K, we need two variables. In one variable we
		 * will save the sum of numbers which will increase by 2 in each turn.
		 * In other variable we will add the previous variable as well as its
		 * own value and compare it with given input.*/

		int sum = 0;
		int k = 0;

		while (sum <= input) {
			k = k + 2;

			if (k >= input)

			{
				break; /* K cannot be greater than input. */
			}

			else {
				sum = k + sum;
			}
		}

		k = k - 2;  /* We know that K is increasing by 2 and when it will become
					 * greater than input, we will decrease it by 2 to get the
					 * greatest value of K which is smaller than input.*/

		System.out.println("The largest K such that 0 + 2 + 4 + 6 +...+ K < " + input + " = \"" + k + "\"");

		scan.close();
	}

}
