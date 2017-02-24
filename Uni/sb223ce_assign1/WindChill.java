package sb223ce_assign1;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class WindChill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.#");  // use 1 decimal format
		
		// user's instruction
		System.out.print("Temperature in celsius: ");
		double temp;
		temp = scan.nextDouble();
		
		System.out.print("Wind speed in m/s: ");
		double windspeed;
		windspeed = scan.nextDouble();
		
		// calculating wind chill according to given formula
		double windChill;
windChill = 33 + (temp- 33)*(0.474 + 0.454 * Math.sqrt(windspeed)-0.0454*windspeed);
		
		System.out.println("Wind chill temperature: "+df.format(windChill));
	scan.close();
	}

}
