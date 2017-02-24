package sb223ce_assign1;
import java.util.Scanner;
public class Time {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	   
		
	   // user's instruction
	    System.out.print("Give a number of seconds: ");
	    int totalSeconds = scan.nextInt();
	   
	    String hours = "Number of hours: ";
		int totalHours = 3600; //1 hour = 3600 seconds
		System.out.println("This equals to"+"\n"+hours +totalSeconds/totalHours);          
		
		String minutes = "Number of minutes: ";
	    int totalMinutes = totalSeconds%totalHours;   
	    // pick leftover seconds from hours           
	    System.out.println(minutes + totalMinutes/60);  //1 minute = 60 seconds 
	     
	    String seconds = "Number of seconds: ";
	    int numberOfSeconds =totalMinutes%60;   // pick seconds that are left from hours and minutes
	    System.out.println(seconds + numberOfSeconds); 
		
	    
		scan.close();
      }

}
