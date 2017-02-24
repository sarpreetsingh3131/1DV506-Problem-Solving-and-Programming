import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Temperature in Fahrenheit: ");
		double input = scan.nextDouble();
		scan.close();
		double celcius = Math.round(((input - 32) * 5) / 9);
		System.out.println("Temperature in Celsius: " + celcius);
	}
}
