package sb223ce_assign1;
import java.util.Scanner;
public class Seconds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// user's instruction 
		System.out.print("Hours: ");
		int hours= scan.nextInt();
		
		System.out.print("Minutes: ");
		int minutes = scan.nextInt();
		
		System.out.print("Seconds: ");
		int seconds = scan.nextInt();
		
		// calculating seconds
		hours = hours*3600;     //1 hour = 3600 seconds
		minutes = minutes*60;  // 1 minutes = 60 seconds //seconds will go as it is
		
	System.out.println("Total time measured in seconds: "+(hours+minutes+seconds));  
		scan.close();
		}

}
