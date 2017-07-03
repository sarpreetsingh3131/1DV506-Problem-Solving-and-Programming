package sb223ce_assign3;

public class MulltiDisplayMain {

	public static void main(String[] args) {

		// call the constructor
		MultiDisplay md = new MultiDisplay();

		// call the methods
		md.setDisplayMessage("Hello World!");
		md.setDisplayCount(2);
		md.display();

		md.display("Goodbye cruel world!", 4);
		System.out.println("Current Message: " + md.getDisplayMessage());

	}

}
