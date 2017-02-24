import java.util.Scanner;

public class SumOfThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Provide a three digit number: ");
		int input = scan.nextInt();
		scan.close();
		int sum = input % 10;
		input /= 10;
		sum += input % 10;
		sum += input / 10;
		System.out.println("Sum of digits: " + sum);
	}
}
