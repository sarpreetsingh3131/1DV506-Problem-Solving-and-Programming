package sb223ce_assign2;

import java.util.Scanner;
import java.util.Random;             /* Need it to select random number */

public class HighLow {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		double random = 1 + 99 * generator.nextDouble();              /* random number between from 1 to 100 */
		int rand = (int) random;                                     /* Change double into integer */
		
		String guess = "Guess ";
		String higher = "Clue: higher";
		String lower = "Clue: lower";
		System.out.println("Guess a value from 1 to 100 " + "\n");

		/* We need for loop and run it 10 times. Every time we will ask
		 * input. For comparing the input with random number we will use 'if'
		 * and 'else if' statement inside the loop. With the help of these
		 * statements we will give clues to user. We will also add 'break'
		 * statement if user guess the value before 10 guess. At last, we will
		 * say if user could not guess the number in 10 guess, we will display
		 * it.*/

		for (int i = 1; i <= 10; i++) {

			System.out.print(guess + i + ": ");

			int input = scan.nextInt();

			if(input != rand && i==10) 
			{
				System.out.println("The correct number is " + rand);
		
			}
			
			else if (rand < input) {
				System.out.println(lower + "\n");

			}

			else if (rand > input ) {
				System.out.println(higher + "\n");

			}

			else if (input == rand) {
				System.out.println("Correct answere only after " + i + " guess - Excellent ");
				break;
			}

			
		}
		scan.close();

	}

}