import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Price: ");
		double price = scan.nextDouble();
		System.out.print("Payment: ");
		double payment = scan.nextDouble();
		scan.close();
		int change = (int) Math.round(payment - price);
		System.out.println("Change: " + change + " kronor");
		System.out.println("1000kr bills: " + (change / 1000));
		change %= 1000;
		System.out.println("500kr bills: " + (change / 500));
		change %= 500;
		System.out.println("100kr bills: " + (change / 100));
		change %= 100;
		System.out.println("50kr bills: " + (change / 50));
		change %= 50;
		System.out.println("20kr bills: " + (change / 20));
		change %= 20;
		System.out.println("10kr bills: " + (change / 10));
		change %= 10;
		System.out.println("5kr bills: " + (change / 5));
		change %= 5;
		System.out.println("1kr bills: " + change);
	}
}
