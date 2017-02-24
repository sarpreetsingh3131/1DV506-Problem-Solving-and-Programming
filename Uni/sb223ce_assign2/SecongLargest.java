package sb223ce_assign2;

import java.util.Scanner;

public class SecongLargest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Provide 10 integers: ");
		
		/* For finding second largest, we will use two variables. We run the
		 * loop 10 times because we need 10 integers. We will also take input
		 * inside the for loop to get 10 integers. Inside the for loop, we need
		 * 'while' statement because we don,t know how many times the input
		 * value will be greater than our variable value.*/
        
        int input;
		int largest = 0;
		int secondlargest = 0;

		for (int i = 0; i < 10; i++) {
			 input = scan.nextInt();

			   while (input > largest) {
				
				 secondlargest = largest;  /* because we know that input is greater, so
				                          'largest' variable is our second largest number.*/

				largest = input;      /*with this, we can find if the next input
									    is greater than previous one .*/
			}
		}

		System.out.println("Second Largest number is: " + secondlargest);

		scan.close();
	}

}
