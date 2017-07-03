package sb223ce_assign4;

import java.io.File;           // import all necessary packages
import java.io.IOException;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) throws IOException {  

	
		
	/*As we are not sure if input file is available or not, in these cases we usually throw input/output exception.
	 * It cover the code with try and catch keywords. we will write the code under the try keyword and 
	 * if for some reasons file is not available or other faults then the code under the catch keyword
	 * will execute. */
		
		try {
			File file = new File(args[0]); // create a new file by using the argument from args[] in main method.
			                               //NOTE: We can use for loop on args[] if we have more than one argument.
			
			Scanner scan = new Scanner(file);   // scan/read the file
			
			/*Create and initialize the array according to the question pattern.*/
			String[] stars = { "1  - 10  | ", "11 - 20  | ", "21 - 30  | ", "31 - 40  | ", 
					           "41 - 50  | ", "51 - 60  | ","61 - 70  | ", "71 - 80  | ", 
					           "81 - 90  | ", "91 - 100 | " }; 
			
			/*Other variables for counting the digits.*/
			int from1To100 = 0;
			int other = 0;
			
			/*Read the file until file have next line and save it line by line in the string*/
			while (scan.hasNextLine()) {
				
				String number = scan.nextLine();
				
				int digit = Integer.valueOf(number); //Convert string to integer for getting numeric value. 

				if (digit <= 100 && digit >= 1) {   // compare the value if it is in given limits.
					
					from1To100++;               // add 1 to the variable (for printing)

				
				/*Now we have 10 conditions and the first true condition
				 *will be selected. */
					
					if (digit <= 10 && digit > 0) {
						stars[0] = stars[0] + '*';
					} 
					else if (digit > 10 && digit <= 20) {
						stars[1] = stars[1] + '*';
					} 
					else if (digit > 20 && digit <= 30) {
						stars[2] = stars[2] + '*';
					} 
					else if (digit > 30 && digit <= 40) {
						stars[3] = stars[3] + '*';
					} 
					else if (digit > 40 && digit <= 50) {
						stars[4] = stars[4] + '*';
					} 
					else if (digit > 50 && digit <= 60) {
						stars[5] = stars[5] + '*';
					} 
					else if (digit > 60 && digit <= 70) {
						stars[6] = stars[6] + '*';
					} 
					else if (digit > 70 && digit <= 80) {
						stars[7] = stars[7] + '*';
					} 
					else if (digit > 80 && digit <= 90) {
						stars[8] = stars[8] + '*';
					} 
					else {
						stars[9] = stars[9] + '*';
					}
				}

				/*If no condition is true, then it will come in variable other*/
				else {

					other++;
				}

			}

			System.out.println("Reading integers from file: " + args[0]);
			System.out.println("Number of integers in the interval [1,100]: " + from1To100);
			System.out.println("Others: " + other);
			System.out.println("Histogram");
			
			for (int i = 0; i < stars.length; i++) {   //for printing array
				System.out.println(stars[i]);
			}

			scan.close();

		} 
		catch (IOException e) {                   //catch if any error comes
			System.err.println(e.getMessage());
		}
	}
}