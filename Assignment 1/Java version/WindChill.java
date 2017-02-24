import java.text.DecimalFormat;
import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Temperature: ");
		double temperature = scan.nextDouble();
		System.out.print("Wind speed: ");
		double windSpeed = scan.nextDouble();
		scan.close();
		double windChill = 33 + (temperature - 33) * (0.474 + 0.454 * Math.sqrt(windSpeed) - 0.0454 * windSpeed);
		DecimalFormat df = new DecimalFormat("#.#");
		System.out.println("Wind Chill Temperature: " + df.format(windChill));
	}
}
