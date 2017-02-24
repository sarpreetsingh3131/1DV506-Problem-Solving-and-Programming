import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("X co-ordinates\nx1 = ");
		int x1 = scan.nextInt();
		System.out.print("x2 = ");
		int x2= scan.nextInt();

		System.out.print("\nY co-ordinates\ny1 = ");
		int y1 = scan.nextInt();
		System.out.print("y2 = ");
		int y2= scan.nextInt();
		scan.close();

		double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		DecimalFormat df = new DecimalFormat("#.000");
		System.out.println("Distance : " + df.format(distance));
	}
}
