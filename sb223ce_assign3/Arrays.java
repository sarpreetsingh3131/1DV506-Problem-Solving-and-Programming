package sb223ce_assign3;

public class Arrays {

	public static void main(String[] args) {

		int[] a = { 100, 3, 2, 1 };
		int[] d = { 3, 2, 1 };

		System.out.println("Sum of all element: " + sum(a));

		System.out.println("Nice looking print: " + toString(a));

		System.out.println("New array: " + toString(addN(a, 2)));

		System.out.println("Reverse order: " + toString(reverse(a)));

		System.out.println("Boolean: " + hasN(a, 6));

		replaceAll(a, 100, 0);

		System.out.println("Replace: " + toString(a));

		System.out.println("Sort: " + toString(sort(a)));

		System.out.println("Has Subsequence: " + hasSubsequence(a, d));
	}
	  
	
	
	
	
	
	
	public static int sum(int[] arr) { // set the input parameter

		int total = 0; // initial the integer variable

		for (int i = 0; i < arr.length; i++) { // run the for loop

			total = total + arr[i];
		} // for every integer at index i add in variable total

		return total; // return sum of array
	}
	
	    
	
	
	
	public static String toString(int[] arr) { // set the input parameter

		String a = ""; // initial the string variable

		for (int i = 0; i < arr.length; i++) { // run the for loop

			if (i == arr.length - 1) {

				a = a + arr[i];
			} // during the last element do not add ","

			else {

				a = a + arr[i] + ",";
			} // add "," to differentiate the elements in array
		}
		return "{" + a + "}"; // add brackets to make the string good looking
								// and return a
	}
	
	   
	   
	
	
	
	public static int[] addN(int[] arr, int n) { // set the parameters

		int[] array = new int[arr.length]; // create a new array of same length as
										// input parameter array

		for (int i = 0; i < arr.length; i++) { // run the for loop

			array[i] = arr[i] + n;
		} // for every integer at index i, add value of parameter integer  n in it

		return array; // return array
	}
	
	    
	   
	
	
	public static int[] reverse(int[] arr) { // set the parameters

		int[] backwards = new int[arr.length]; // create a new array of same
												// length as input parameter
												// array

		int endPosition = arr.length - 1; // save the length of given array

		for (int i = endPosition; i >= 0; i--) { // run the loop from last index

			backwards[endPosition - i] = arr[i];
		} // take integer from last index and save it in the beginning index

		return backwards; // return array
	}
	   
	    
	
	
	public static boolean hasN(int[] arr, int n) { // set the parameters

		for (int i = 0; i < arr.length; i++) { // run the for loop

			if (arr[i] == n) // return true, if integer at index i is same as
								// parameter integer n

				return true;
		}
		return false;
	}

	
	   
	   
	
	
	public static void replaceAll(int[] arr, int old, int nw) { // set the
																// parameters

		for (int i = 0; i < arr.length; i++) { // run the for loop

			if (arr[i] == old) { /*
									 * if integer at index i is same as
									 * parameter integer old, then replace it
									 * with parameter integer new
									 */
				arr[i] = nw;
			}
		}
	} // no return, because it is void method	  
	    
	   
	
	
	public static int[] sort(int[] arr) { // set the parameters

		int[] array = new int[arr.length]; // create a new array of same length as
										// input parameter array

		for (int i = 0; i < arr.length; i++) { // run the loop

			array[i] = arr[i]; // add all the elements to array a
		}

		int temprary = 0; // create a variable to store the value temporary

		for (int i = 0; i < array.length; i++) { // run the loop

			for (int j = 0; j <= array.length - 2; j++) { // run the inner loop up to
														// length-2 to compare
														// the next value

				if (array[j] > array[j + 1]) { // comparing array values

					temprary = array[j]; // store value of array a in temporary
										// variable

					array[j] = array[j + 1]; // swap values

					array[j + 1] = temprary; // store temporary value in array a at
											// index [j+1]

				}
			}
		}
		return array; // return new sorted array
	}
	
	   
	  
	
	
	public static boolean hasSubsequence(int[] arr, int[] sub) { // set the
																	// parameters

		String ar = ""; /* create two strings*/

		String subs = "";

		for (int i = 0; i < arr.length; i++) { // run the for loop

			ar = ar + arr[i]; // add the elements from parameter int[] arr to
								// string ar
		}

		for (int i = 0; i < sub.length; i++) { // run the for loop

			subs = subs + sub[i]; // add the elements from parameter int[] sub
									// to string subs
		}

		return ar.contains(subs); // return true, if string ar have same
									// sequence as string subs
	}
}
