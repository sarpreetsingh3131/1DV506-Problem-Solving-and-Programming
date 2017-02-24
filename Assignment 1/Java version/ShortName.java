import java.util.Scanner;

public class ShortName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("First Name: ");
		String fName = scan.nextLine();
		System.out.print("Last Name: ");
		String lName = scan.nextLine();
		scan.close();
		String sName = fName.charAt(0) + ". " + lName.substring(0, 4);
		System.out.println("Short Name: " + sName);
	}
}
