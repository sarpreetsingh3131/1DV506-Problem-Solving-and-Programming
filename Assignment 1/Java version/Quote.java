import java.util.Scanner;

public class Quote {

	public static void main(String[] args) {
		System.out.print("Write a line of text: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		System.out.println("Quote: \""  +  input + "\"");
	}
}
