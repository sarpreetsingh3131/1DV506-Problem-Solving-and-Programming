package sb223ce_assign3;

public class MultiDisplay {

	
	
	private int displayCount;           // create fields
	private String displayMessage;

	
	
	public MultiDisplay() { // create empty constructor

	}

	
	
	
	public MultiDisplay(String displayMessage, int count) { /*constructor with
															 parameters**/
		displayCount = count; /* give the parameter variables value to field
								 variables**/
		this.displayMessage = displayMessage;
	}

	
	
	
	public void setDisplayMessage(String displayMessage) { // method syntax
		this.displayMessage = displayMessage; /* give the parameter variable
												 value to field variable**/
	}// no return, because it is void method

	
	
	
	public void setDisplayCount(int n) { // method syntax
		displayCount = n; // give the parameter variable value to field variable
	}

	
	
	
	public void display() { // method syntax
		int count = displayCount; /*give field variable value to new variable
									for printing the message**/

		for (int i = 0; i < count; i++) {
			System.out.println(displayMessage);
		}

	}// no return, because it is void method

	
	
	
	public void display(String displayMessage, int n) { // method syntax
		this.displayMessage = displayMessage; // give back to field variable
		for (int i = 0; i < n; i++) { // print the message parameter n times
			System.out.println(displayMessage);
		}
	}// no return, because it is void method

	
	
	
	public String getDisplayMessage() { // method syntax
		return displayMessage; // give back to field variable
	}

	
	
	
	public int getDisplayCount() { // method syntax
		return displayCount; // give back to field variable
	}

}
