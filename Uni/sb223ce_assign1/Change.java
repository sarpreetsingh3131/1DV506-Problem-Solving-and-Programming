package sb223ce_assign1;
import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// user's instruction 
		System.out.print("Total price: ");
		double price;
		price = scan.nextDouble();
		System.out.print("Payment: ");
		double payment;
		payment = scan.nextDouble();
	    
		int  change;
		change =(int) Math.round(payment - price);   
		// change the (change) from double to integer according to instruction  
		System.out.println("Change: "+change+" kronor");
		
	    String thousandBills = "Number of 1000kr bills: ";
		int thousand = 	1000;  //fixed integer
		System.out.println(thousandBills +change/thousand); 
		// divide change by thousand, to get 1000kr bills
		
		String fiveHunderedBills = "Number of 500kr bills: ";
		int fiveHundered= change % thousand; 
		// use modulus to find the leftover money from thousand 
		System.out.println(fiveHunderedBills + fiveHundered/500); 
		//divide it by 500 to get 500kr bills 
		
		String oneHunderedBills = "Number of 100kr bills: ";
        int oneHundered = fiveHundered % 500; 
        // use modulus to find the leftover money from fiveHundered
		 System.out.println(oneHunderedBills +oneHundered/100); 
		 //divide it by 100 to get 100kr bills 
		
		String fiftyBills = "Number of 50kr bills: ";
		int fifty = oneHundered % 100;  
		// use modulus to find the leftover money from oneHundered  
		System.out.println(fiftyBills + fifty/50); 
		//divide it by 50 to get 50kr bills 
		
		String twentyBills = "Number of 20kr bills: ";
		int twenty = fifty % 50; 
		// use modulus to find the leftover money from fifty      
		System.out.println(twentyBills + twenty/20); 
		//divide it by 20 to get 20kr bills
		
		String tenBills = "Number of 10kr bills: ";
		int ten = twenty % 20;   
		//use modulus to find the leftover money from twenty           
		System.out.println(tenBills + ten/10); 
		//divide it by 10 to get 10kr bills 
		
		String fiveBills = "Number of 5kr bills: ";
	    int five = ten % 10;  
	    //use modulus to find the leftover money from ten                 
		System.out.println(fiveBills + five/5); 
		//divide it by 5 to get 5kr bills 
		
		String oneBills = "Number of 1kr bills: ";
		int one = five % 5; 
		//use modulus to find the leftover money from five            
		System.out.println(oneBills + one/1); 
		//divide it by 1 to get 1kr bills 
		scan.close();	
		}

}
