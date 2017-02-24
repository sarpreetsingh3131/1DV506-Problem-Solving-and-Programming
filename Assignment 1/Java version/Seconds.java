import java.util.Scanner;

public class Seconds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hours: ");
		int hours = scan.nextInt();
		System.out.print("Minutes: ");
		int minutes = scan.nextInt();
		System.out.print("Seconds: ");
		int seconds = scan.nextInt();
		scan.close();
		System.out.println("Total time measured in seconds: " + ((hours * 3600) + (minutes * 60) + seconds));
	}
}
