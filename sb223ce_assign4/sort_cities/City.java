package sb223ce_assign4.sort_cities;

import java.io.*;
import java.util.Scanner;    // import necessary packages

public class City implements Comparable<City> {

	/* Field variables */
	int zipCode;
	private String cityName;
	private City[] city;
	private String path;

	
	/* Constructor */
	public City() {
		zipCode = 0;
		cityName = "";
		city = new City[0];    //initializing field variables
		path = "";
	}

	
	/* Constructor with parameters */
	public City(int zipCode, String cityName) {
		
		this.zipCode = zipCode;
		
		this.cityName = cityName;
	}

	
	/* Getter/accesses method  */
	public int getZipCode() {
		
		return zipCode;
	}

	/* Getter/accesses method  */
	public String getCityName() {
		
		return cityName;
	}

	/* method which return string containing zip code and city name  */
	public String toString() {
		
		return "" + getZipCode() + " " + getCityName();
	}

	
	/* Read file */
	public void readFile(String path) {
		
		this.path = path;  //Copying path for printing later on
		
		/*As we are not sure if input file is available or not, 
		 * in these cases we usually throw input/output exception.
		 * It cover the code with try and catch keywords. we will 
		 * write the code under the try keyword and if for some 
		 * reasons file is not available or other faults then the 
		 * code under the catch keyword will execute. */
		
		try {
			Scanner scan = new Scanner(new File(path));  // read the file, until it has nextLine
			
			while (scan.hasNextLine()) {
				
				String read = scan.nextLine();    // save one line at a time in read variable
				
				char ch = ';';                 //we already know that semicolon differentiate the zip code and city name
				
				int semiColon = read.indexOf(ch);     // find the index of semicolon in the line
				
				if (Character.isDigit(read.charAt(semiColon - 1))) {   // check if there is zipcode before semicolon
					
					zipCode = Integer.valueOf(read.substring(0, semiColon));   // if yes, change it in to integers and save it in field variable
					
					cityName = read.substring(semiColon + 1);      // so obviously, rest is the city name

				} else {
					
					cityName = read.substring(0, semiColon);        // if before semicolon it's not zipcode, then do it in opposite way
					
					zipCode = Integer.valueOf(read.substring(semiColon + 1));
				}

				
				
				City a = new City(zipCode, cityName);    // create a city object
				
				
					resize();                           // resize the city array for saving the city object
				
				city[city.length - 1] = a;           // save it in city array

			}

			scan.close();
		}

		catch (FileNotFoundException e) {              // catch the error
			System.err.println(e.getMessage());
		}

	}

	
	public void sort() {      
		
		City temp;                         // create temporary city object
		
		for (int i = 0; i < city.length; i++) {      //Run the loop
			
			for (int j = 0; j <= city.length - 2; j++) {
				
				City a = city[j];            // get one city object
				
				City b = city[j + 1];          // get other city object
				
				int result = a.compareTo(b);      // compare them
				
				if (result > 0) {                 // check the result and sort them
					
					temp = city[j];             //if 1st object have higher zipcode put it into temp object
					
					city[j] = city[j + 1];        // swap the lower zipcode city with higher one
					
					city[j + 1] = temp;           // save the higher zipcode city at second position for comparing to next one
				}
			}
		}
	}

	
	
	public int compareTo(City a) {        
		
		return zipCode - a.getZipCode();     // compare the zipcodes
			
	}

	
	
	public void print() {
		
		/* print all the cities including path of the file*/
		System.out.println("Reading cities from: " + path);
		
		System.out.println("Number of cities found: " + city.length);
		
		for (int i = 0; i < city.length; i++) {
			System.out.println(city[i]);
		}
	}

	
	
	private void resize() {
		
		/* Create a new array with size 1 greater than the field array. Then
		 * transfer all the cities of field array into it. At last, convert
		 * that array into field array. By doing this, we have 1 empty place in
		 * our field array where we can save the new city.
		 */
		
		City[] temp = new City[city.length + 1];
		
		for (int i = 0; i < city.length; i++) {
			temp[i] = city[i];
		}
		city = temp;
	}
}