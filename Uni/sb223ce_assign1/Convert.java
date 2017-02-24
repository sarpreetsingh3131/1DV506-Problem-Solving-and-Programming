package sb223ce_assign1;
import java.util.Scanner;


public class Convert {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//user's instruction 
	System.out.print("Write the temperature in fahrenheit: ");
	double temperature;
	temperature = scan.nextDouble();
	
	//calculating the temperature according to given formula
	double celsius;
	celsius = Math.round((temperature - 32) * 5/9);
	//Math.round to change the number to nearest integer with single decimal
	
	System.out.println("The temperature in celsius: "+ celsius); 
	scan.close();
	}

}
