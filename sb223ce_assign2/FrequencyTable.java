package sb223ce_assign2;

import java.util.Random;

public class FrequencyTable {

	public static void main(String[] args) {

		int[] dice = new int[6];         /* An array whose size is 6.
		                                   Array start from position 0 and we 
		                                   know that dice have six sides.*/

		Random ran = new Random();
		int roll = 0;

		for (int i = 0; i < 6000; i++) {
			roll = ran.nextInt(6)+ 1; /* Add 1, because random number are from 0 to 5 */

			if (roll == 1) {
				dice[0]++;       /*whenever its 1 on dice, increment by 1 at position 0*/
			} else if (roll == 2) {
				dice[1]++;     /*whenever its 2 on dice, increment by 1 at position 1*/
			} else if (roll == 3) {
				dice[2]++;     /*whenever its 3 on dice, increment by 1 at position 2*/
			} else if (roll == 4) {
				dice[3]++;     /* whenever its 4 on dice, increment by 1 at position 3*/

			} else if (roll == 5) {
				dice[4]++;   /*whenever its 5 on dice, increment by 1 at position 4*/
			} else {
				dice[5]++;    /*whenever its 6 on dice, increment by 1 at position 5*/

			}
		}

		System.out.println("Frequencies when rolling a dice 6000 times.");
		System.out.println("1: " + dice[0]);
		System.out.println("2: " + dice[1]);
		System.out.println("3: " + dice[2]);
		System.out.println("4: " + dice[3]);
		System.out.println("5: " + dice[4]);
		System.out.println("6: " + dice[5]);
	}

}
