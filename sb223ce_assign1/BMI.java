package sb223ce_assign1;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//  user's instruction 
	System.out.print("Give your length in meters: ");
	double length;
	length = scan.nextDouble();
	
	System.out.print("Give your weight in kilograms: ");
	double weight;
	weight = scan.nextDouble();
	
    int BMI;
	BMI= (int)(Math.round(weight/Math.pow(length,2)));  
	//first round off to nearest number and change from double to integer
	
	System.out.println("Your BMI is: "+BMI);
	scan.close();
	}

}
