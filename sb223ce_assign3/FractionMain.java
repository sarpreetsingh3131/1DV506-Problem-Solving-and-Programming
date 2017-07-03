package sb223ce_assign3;

public class FractionMain {

	public static void main(String[] args) {

		// call the constructor
		Fraction f = new Fraction(-2, 6);
		Fraction f1 = new Fraction(3, 6);

		// call the methods

		System.out.println("Get numerator: " + f.getNumerator());

		System.out.println("Get denominator: " + f.getDenominator());

		System.out.println("is negative: " + f1.isNegative());

		System.out.println("add: " + f1.add(f));

		System.out.println("subtract: " + f1.subtract(f));

		System.out.println("multiply: " + f1.multiply(f));

		System.out.println("divide: " + f.divide(f1));

		System.out.println("is equal: " + f1.isEqualTo(f));

		System.out.println("String: " + f.toString());

	}

}
