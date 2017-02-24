package sb223ce_assign3;

public class SweID {

	public static void main(String[] args) {

		String id = "950131-0271";

		String id1 = "920302-1465";

		System.out.println("First Part: " + getFirstPart(id));

		System.out.println("Second Part: " + getSecondPart(id));

		System.out.println("Female: " + isFemaleNumber(id));

		System.out.println("Male: " + isMaleNumber(id));

		System.out.println("Equal: " + areEqual(id1, id));

		System.out.println("Is Correct: " + isCorrect(id));

	}

	public static String getFirstPart(String text) { // set the parameter

	
		String first = ""; // create a string

		for (int i = 0; i < text.length() - 5; i++) { // run the loop up to
														// first five characters

			first = first + text.charAt(i); // add the characters in string
		}

		return first; // return the string
	}

	public static String getSecondPart(String text) { // set the parameter

		String second = ""; // create a string

		for (int i = 7; i < text.length(); i++) {

			second = second + text.charAt(i); // add the characters in string
		}

		return second; // return the string
	}

	public static boolean isFemaleNumber(String a) { // set the parameter

		// check if user provide digit at index 9 and is even number

		if (Character.isDigit(a.charAt(9)) && a.charAt(9) % 2 == 0) {
			return true;
		}

		return false;
	}

	public static boolean isMaleNumber(String a) { // set the parameter

		// check if user provide digit at index 9 and is odd number

		if (Character.isDigit(a.charAt(9)) && a.charAt(9) % 2 > 0) {
			return true;
		}
		return false;
	}

	public static boolean areEqual(String a, String b) { // set the parameter

		for (int i = 0; i < a.length(); i++) { // run the loop

			if (a.charAt(i) != b.charAt(i)) { // check if character at index i
												// is same in both strings

				return false;
			}
		}
		return true;
	}

	
	
	public static boolean isCorrect(String a) { // set the parameter

		// create three substring of parameter string a to check month, year and
		// date

		String idMonth = a.substring(2, 4); // contains character at index 2 and
											// 3

		String idDate = a.substring(4, 6); // contains character at index 4 and
											// 5

		int date = Integer.valueOf(idDate); // get the value to make a date

		int month = Integer.valueOf(idMonth); // get the value to make a month

		String leapYear = a.substring(0, 2); // contains character at index 0
												// and 1

		int year = Integer.valueOf(leapYear); // get the value to make a year

		// call the method lastDigit
		if (lastDigit(a) == true) {

			// if month is odd and less than 8 and date is less than 32
			if (month > 0 && month < 8 && month % 2 > 0 && date > 0 && date < 32) {
				return true;
			}

			// if month is even (not feb) and less than 8 and date is less than
			// 31
			else if (month > 0 && month < 8 && month != 2 && month % 2 == 0 && date > 0 && date < 31) {
				return true;
			}

			// if month is 8 to 12 and even and date is less than 32
			else if (month >= 8 && month <= 12 && month % 2 == 0 && date < 32 && date > 0) {
				return true;
			}

			// if month is 9 to 11 and odd and date is less than 31
			else if (month > 8 && month < 12 && month % 2 > 0 && date < 31 && date > 0) {
				return true;
			}

			// if month is 2 and leap year and date is less than or equal to 29
			else if (month == 2 && date <= 29 && date > 0 && year % 4 == 0) {
				return true;
			}

			// if month is 2 and not leap year and date is less than 28
			else if (month == 2 && date <= 28 && date > 0 && year % 4 > 0) {
				return true;
			}
		}
		return false;
	}

	
	
	private static boolean lastDigit(String text) { // set the parameter

		// create substring to check last digit, in this we will not include last digit, because we compare it
		String ninthDigit = text.substring(0, 6) + text.substring(7, 10);

		int lastNumber = Character.getNumericValue(text.charAt(text.length() - 1)); // get
																					// last
																					// digit
																					// value
																					// to
																					// compare

		// create variables to store value
		int sumMultiplyBy2 = 0;

		int sumMultiplyBy1 = 0;

		int total = 0;

		

		for (int i = 0; i < ninthDigit.length(); i++) { // lets run the loop

			if (i % 2 == 0) { // while i is even

				sumMultiplyBy2 = Character.getNumericValue(ninthDigit.charAt(i)) * 2; // multiply
																			// the
																			// number
																			// with
																			// 2
																			// at
																			// index
																			// i

				if (sumMultiplyBy2 > 9) { // after multiplication if we get two digits
								              // number

					int lastDigit = sumMultiplyBy2 % 10; // get the last digit

					int secondLastDigit = (sumMultiplyBy2 / 10) % 10; // remove the last digit and get
												                       // the second last digit

					
                  total = total + lastDigit + secondLastDigit; // add them
				}

				else if (sumMultiplyBy2 < 10) { // after multiplication if we get one digit
										           // number
                     total = total + sumMultiplyBy2;       // save it directly
				}
			}

			else { // while i is odd, multiply the number with 1 at index i

				sumMultiplyBy1 = sumMultiplyBy1 + Character.getNumericValue(ninthDigit.charAt(i)) * 1; // save
																					                      // it
			}
		}

		int grandTotal = total + sumMultiplyBy1; // now add all the variables

		grandTotal = 10 - grandTotal % 10; // get the last digit and decrease it
										// from 10

		if (grandTotal == lastNumber) { // check if it is same as in given parameter string

			return true;
		}

		return false;
	}
}
