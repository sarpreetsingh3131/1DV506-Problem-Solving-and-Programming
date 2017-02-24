import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Give number of seconds: ");
		int seconds = scan.nextInt();
		scan.close();
		int hours = seconds / 3600;
		seconds -= hours * 3600;
		int minutes = seconds / 60;
		seconds -= minutes * 60;
		System.out.println("This corresponds to: " + hours + " hours " + minutes + " minutes " + seconds + " seconds.");
	}
}
