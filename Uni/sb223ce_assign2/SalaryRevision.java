package sb223ce_assign2;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Collections;

public class SalaryRevision {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> salary = new ArrayList<Integer>();
		System.out.print("Provide salaries (and terminate with negtaive integer): ");

		/*As we do not know, how many times user will input the salary So, we
		 * will use 'do while' statement until, user provide any negative integer which we
		 * mentioned in instruction. Salary can never be negative. So, we will
		 * stop getting the input after negative integer.*/

		double input;   /* Salary can be double*/
		int sum;
		do {
			input = scan.nextDouble();
			sum = (int) Math.round(input);   /* Change from double to integer*/
			if (sum >= 0) {
				salary.add(sum); /* save the positive integers in array list */
			}

		} while (input > -1);

		Collections.sort(salary); /* Sort the array list */

		int length = salary.size() - 1;

		/*Now if the length of salary array list is even then it will be equal
		 * to zero with mode 2 else more than zero. One point which we have to notice is the
		 * array list start counting from 0 and the length which we consider is
		 * even; in normal counting will be odd and vice versa. So for finding
		 * median if length is odd we need the middle two integer. we divide the
		 * length by 2 to get the fist integer which is at one index before the half
		 * of the length. Then for getting the next integer which is one index ahead then it
		 *  we will first divide the length and then add 1 in it.For even just divide the length
		 *  by 2 and pick the integer on that index*/

		if (length % 2 > 0) {
			int oddNumberMedian = Math.round(salary.get(length / 2) + salary.get((length / 2) + 1));

			System.out.println("Median: " + Math.round(oddNumberMedian / 2));

			/*As we already sort the array list, we know that greatest and
			 * smallest integer.*/

			System.out.println("Gap: " + (salary.get(length) - salary.get(0)));
		}

		else if (length % 2 == 0) {
			int evenNumberMedian = salary.get(length / 2);

			System.out.println("Median: " + evenNumberMedian);

			System.out.println("Gap: " + (salary.get(length) - salary.get(0)));
		}

		/*For finding average we need to add all the given salaries and then
		 * divide it with the total number of given salaries. As I mentioned
		 * above that array start from 0 index so while dividing we will add 1
		 * in the length to find the correct average*/

		int average = 0; /* We will save the sum of salaries */

		for (int i = 0; i <= length; i++) {

			average = average + salary.get(i);

		}

		average = Math.round(average / (length + 1));

		System.out.println("Average: " + average);

		scan.close();
	}
}
