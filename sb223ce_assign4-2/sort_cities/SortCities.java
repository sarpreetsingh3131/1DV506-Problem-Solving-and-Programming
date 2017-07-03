package sb223ce_assign4.sort_cities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortCities {

	/* Fields */
	private static ArrayList<City> cities = new ArrayList<City>();
	private static String path = "";
	private static int zipCode = 0;
	private static String name = "";

	public static void main(String[] args) {

		/* Methods */
		readFile("/Users/SarpreetSingh/Documents/city.txt");
		sortAndPrint();
	}

	/* Method which read file and create a new city */
	public static void readFile(String path) {

		SortCities.path = path; // Copying path for printing later on

		/*
		 * As we are not sure if input file is available or not, in these cases
		 * we usually throw input/output exception. It cover the code with try
		 * and catch keywords. we will write the code under the try keyword and
		 * if for some reasons file is not available or other faults then the
		 * code under the catch keyword will execute.
		 */

		try {
			Scanner scan = new Scanner(new File(path)); // read the file, until
														// it has nextLine

			while (scan.hasNextLine()) {

				String read = scan.nextLine(); // save one line at a time in
												// read variable

				char ch = ';'; // we already know that semicolon differentiate
								// the zip code and city name

				int semiColon = read.indexOf(ch); // find the index of semicolon
													// in the line

				if (Character.isDigit(read.charAt(semiColon - 1))) { // check if
																		// there
																		// is
																		// zipcode
																		// before
																		// semicolon

					zipCode = Integer.valueOf(read.substring(0, semiColon));
					name = read.substring(semiColon + 1);
					cities.add(new City(name, zipCode));

					/* Optional */
					// cities.add(new City(read.substring(semiColon +
					// 1),Integer.valueOf(read.substring(0, semiColon))));

				} else {

					name = read.substring(0, semiColon);
					zipCode = Integer.valueOf(read.substring(semiColon + 1));
					cities.add(new City(name, zipCode));

					/* Optional */
					// cities.add(new City(read.substring(0, semiColon),
					// Integer.valueOf(read.substring(semiColon + 1))));
				}

			}

			scan.close();
		}

		catch (FileNotFoundException e) { // catch the error
			System.err.println(e.getMessage());
		}

	}

	/* Sort and Print the cities */
	public static void sortAndPrint() {
		Collections.sort(cities);
		System.out.println("Reading cities from file: " + path);
		System.out.println("Total cities found: " + cities.size());
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

	}
}
