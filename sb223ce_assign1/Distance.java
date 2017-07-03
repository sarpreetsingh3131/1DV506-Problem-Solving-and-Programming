package sb223ce_assign1;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Distance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.000");  //rounding off to 3 decimals
		
		// user's instruction 
		System.out.print("Type X coordinates \nx1 = ");
	    int x1 = scan.nextInt();
		
	    System.out.print("x2 = ");
        int x2 = scan.nextInt();
		
        System.out.print("Type Y coordinates\ny1 = ");
	    int y1 = scan.nextInt();
		
	    System.out.print("y2 = ");
	    int y2 = scan.nextInt();
	   
	    //calculating the distance
	    double distance;        
		distance = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
		// use Math.pow for raising the power up to 2
		
		System.out.print("distance between x and y = "+df.format(distance));
		scan.close();
		}

}
