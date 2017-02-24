package sb223ce_assign1;
import java.util.Random;

public class TelephoneNumber {

	public static void main( String[] args) {
		 Random generator = new Random();
		 int first =  generator.nextInt(1);       //always need number 0              
	     
		 int areaCode1 = generator.nextInt(10);   //any random number between 0 to 9
		 int areaCode2 = generator.nextInt(10);
		 int areaCode3 = generator.nextInt(10);
         
		 int z = generator.nextInt(10)+1;       // always need more than 0, so add 1
	     
		 int y1 = generator.nextInt(10);       // any random number between 0 to 9
	     int y2 = generator.nextInt(10);     
	     int y3 = generator.nextInt(10);  
	     int y4 = generator.nextInt(10); 
	     int y5 = generator.nextInt(10);
	     
  System.out.print("Random telephone number is: "+first+areaCode1+areaCode2+
		                                         areaCode3+"-"+z+y1+y2+y3+y4+y5);
		}

}
