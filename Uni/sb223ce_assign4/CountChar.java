package sb223ce_assign4;

import java.io.File;
import java.io.FileNotFoundException;   // import all necessary packages
import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		
		readAndCount("/Users/SarpreetSingh/Documents/pp.txt");
  }

	
	public static void readAndCount(String path) {  //create method
		
		/*Create four variable for accounting whitespace, upper,lower and other characters*/
		int uppercase = 0;
		int lowercase = 0;
		int whitespaces = 0;
		int other = 0;

		
		/*As we are not sure if input file is available or not, in these cases we usually throw input/output exception.
		 * It cover the code with try and catch keywords. we will write the code under the try keyword and 
		 * if for some reasons file is not available or other faults then the code under the catch keyword
		 * will execute. */
		
		
		try {
			File file = new File(path); // create a new file by using method parameter argument

			Scanner scan = new Scanner(file);  // read the file 
			
			String read = "";         //Create and initialize the string
			
			while (scan.hasNextLine()) {   //Read the file until it has next line
				
				whitespaces++;             // for counting return, tab
				
				read = read + scan.nextLine();   // save the file in string

			}

			/* With the help of for loop, we will take one character at a time and
			 * check it, if it is the one we are looking for then we will add 1
			 * in that variable. If not, then in variable other*/
			
			for (int i = 0; i < read.length(); i++) {  

				char c = read.charAt(i);

				if (Character.isWhitespace(c)) {
					whitespaces++;
				} else if (Character.isUpperCase(c)) {
					uppercase++;
				}

				else if (Character.isLowerCase(c)) {
					lowercase++;
				}

				else {
					other++;
				}

			}

			System.out.println("Reading file from: " + file.getAbsolutePath());
			System.out.println("Number of upper case letters: " + uppercase);
			System.out.println("Number of lower case letters: " + lowercase);
			System.out.println("Number of \"whitespaces\": " + whitespaces);
			System.out.println("Other Characters: " + other);

			scan.close();
		} 
		catch (FileNotFoundException e) {  // for catching any type of error while finding/reading the file.
			System.err.println(e.getMessage());
		}
	}
}