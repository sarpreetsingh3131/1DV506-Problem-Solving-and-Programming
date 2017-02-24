package sb223ce_assign1;
import java.util.Scanner;
public class SumOfThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// user's instruction 
		System.out.print("Type a three digit number: ");
	    
		int threeDigits = scan.nextInt();
		int sum1 = threeDigits%10;            
		//pick last number
        
		int sum2 = threeDigits/10%10;         
        //remove last number and pick second last number
        
		int sum3=  threeDigits/10/10%10;       
       // remove last two numbers and pick first number
	
		System.out.println("Sum of three digits: "+(sum1+sum2+sum3));
	    scan.close();
	    }
}