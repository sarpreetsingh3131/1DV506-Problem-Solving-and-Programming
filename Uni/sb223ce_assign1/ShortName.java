package sb223ce_assign1;
import java.util.Scanner;

public class ShortName {

	public static void main(String[] args) {
	Scanner scan  = new Scanner(System.in);
	
	// user's instruction 
	System.out.print("First name: ");
	String FirstName;
	FirstName = scan.nextLine();
	
	System.out.print("Last name: ");
	String LastName=scan.nextLine() + "   "; //add 3 spaces in case if last name 
	                                          //is less than 4 letter 
	
	char dot = '.';
	char first = FirstName.charAt(0);  //pick 1st letter
	char second = LastName.charAt(0);  
	char third = LastName.charAt(1);   //pick 2nd letter
	char fourth = LastName.charAt(2);  //pick 3rd letter
	char fifth = LastName.charAt(3);   //pick 4th letter
	
	System.out.println("Short name: "+ first+dot+"\t"+second+third+fourth+fifth);
	scan.close();
	}

}
