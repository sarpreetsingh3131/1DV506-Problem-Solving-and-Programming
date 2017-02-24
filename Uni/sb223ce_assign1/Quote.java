package sb223ce_assign1;
import java.util.Scanner;  
public class Quote {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//user'sinstruction 
		System.out.print("Type a line of text: ");
		String text = scan.nextLine(); 
		
		System.out.println("Quote: \""+text+ "\"");    
		// need "\""  "\"" for quotation marks 
		scan.close();
		}

}