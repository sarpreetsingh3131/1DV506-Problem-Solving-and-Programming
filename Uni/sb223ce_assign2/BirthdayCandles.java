package sb223ce_assign2;

import java.util.Scanner;

public class BirthdayCandles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/* User instruction */
		System.out.print("Type the birthday number: ");
		int birthday = scan.nextInt();
		scan.close();

		int totalCandles = 0;
		final int candlesInOneBox = 24;
		int box = 0;

		/*
		 * We need for loop, because we know our starting(0) and end point
		 * (given birthday number).
		 */

		for (int i = 1; i <= birthday; i++) {

			/*
			 * Until birthday number is greater than the number of candles we
			 * have, add 24 candles(new box).
			 */
			while (totalCandles < i) {

				totalCandles = totalCandles + candlesInOneBox;

				box++;

			}

			totalCandles = totalCandles - i;
			/*
			 * For finding Remaining candles, we will subtract the birthday
			 * number from the candles we have.
			 */

		}

		System.out.println("Remaining Candles: " + totalCandles);
		System.out.println("Number of bought boxes: " + box);

	}

}
