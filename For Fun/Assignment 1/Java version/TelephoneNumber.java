import java.util.Random;

public class TelephoneNumber {

	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println("Random telephone number: 0" + ran.nextInt(10) + ran.nextInt(10) + ran.nextInt(10) + "-"
				+ (ran.nextInt(9) + 1) + ran.nextInt(10) + ran.nextInt(10) + ran.nextInt(10) + ran.nextInt(10)
				+ ran.nextInt(10));
	}
}
