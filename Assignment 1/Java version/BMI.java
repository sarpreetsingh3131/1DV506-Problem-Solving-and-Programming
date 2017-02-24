import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Give your length in meters: ");
		double length = scan.nextDouble();
		System.out.print("Give your weight in kilograms: ");
		double weight = scan.nextDouble();
		scan.close();
		System.out.println("Your BMI: " + Math.round((weight / (length * length))));
	}
}
