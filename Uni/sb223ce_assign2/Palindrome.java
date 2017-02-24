package sb223ce_assign2;
import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type a line: ");
		String text = scan.nextLine();
		scan.close();
		String str = "";
		String buf = "";
		
		
		/*First we will use for loop and pick only letter from given line*/
		
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);

			if (Character.isLetter(c) && Character.isLowerCase(c)) {
				str = str + c;
			} else if (Character.isUpperCase(c)) {
				str = str + (Character.toLowerCase(c));     /*Change to lower case*/
			}

		}

		
		/*Now, we will reverse those letter and save it in another string*/
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);

			buf = buf + ch;

		}

		
	/* Now, compare the both string order   */
		if (buf.equals(str)) {
			System.out.println("The line is palindrome.");
		}

		else {
			System.out.println("The line is not palindrome.");
		}

	}

}
