package sb223ce_assign3;

public class Fraction {

	private int numerator; // create fields
	private int denominator;

	public Fraction(int num, int denom) { // constructor with parameters

		numerator = num; /*
							 * give the vale of parameter a variable to field
							 * variable numerator
							 **/
		denominator = denom; /*
								 * give the vale of parameter b variable to
								 * field variable denominator
								 **/
		reduceFraction();  // call method

		if (denominator == 0) { // for handling invalid fraction
			System.err.println("Invalid fraction: Denominator is zero");
		}

	}

	public Fraction(Fraction f) { // another constructor which handle fraction

		numerator = f.numerator; /*
									 * give the vale of parameter fraction
									 * numerator variable to field variable
									 * numerator
									 **/
		denominator = f.denominator; /*
										 * give the vale of parameter fraction
										 * denominator variable to field
										 * variable denominator
										 **/
	}

	public int getNumerator() { // method syntax
		return numerator; /*
							 * get numerator value and return to field numerator
							 * variable
							 **/
	}

	public int getDenominator() { // method syntax
		return denominator; /*
							 * get denominator value and return to field
							 * denominator variable
							 **/
	}

	public boolean isNegative() { // method syntax
		return (numerator < 0
				|| denominator < 0); /*
										 * check if num or denom is less than 0
										 **/
	}

	public Fraction add(Fraction frac) { // method syntax

		int denom = denominator
				* frac.denominator; /*
									 * multiply field denom with param denom and
									 * save the value in new variable
									 **/

		int num1 = numerator
				* frac.denominator; /*
									 * multiply field num with param num and
									 * save the value in new variable
									 **/

		int num2 = frac.numerator
				* denominator; /*
								 * multiply field num with param denom and save
								 * the value in new variable
								 **/

		Fraction frcation = new Fraction((num1 + (num2)),
				denom); /*
						 * create and return new fraction with new variables
						 **/
		return frcation;

	}

	public Fraction subtract(Fraction frac) { // method syntax

		int denom = denominator
				* frac.denominator; /*
									 * multiply field denom with param denom and
									 * save the value in new variable
									 **/

		int num1 = numerator
				* frac.denominator; /*
									 * multiply field num with param // denom
									 * and save the value in new variable
									 **/

		int num2 = frac.numerator
				* denominator; /*
								 * multiply param num with field denom and save
								 * the value in new variable
								 **/

		Fraction fraction = new Fraction((num1 - (num2)),
				denom); /*
						 * create and return new fraction with new variables
						 **/
		return fraction;

	}

	public Fraction multiply(Fraction frac) { // method syntax

		int denom = denominator
				* frac.denominator; /*
									 * multiply field denom with param denom and
									 * save the value in new variable
									 **/

		int num = numerator
				* frac.numerator; /*
									 * multiply field num with param num and
									 * save the value in new variable
									 **/

		Fraction fraction = new Fraction(num,
				denom); /*
						 * create and return new fraction with new variables
						 **/
		return fraction;
	}

	public Fraction divide(Fraction frac) { // method syntax

		int denom = denominator
				* frac.numerator; /*
									 * multiply field denom with param denom and
									 * save the value in new variable
									 **/

		int num = numerator
				* frac.denominator; /*
									 * multiply field num with param denom and
									 * save the value in new variable
									 **/

		Fraction fraction = new Fraction(num,
				denom); /*
						 * create and return new fraction with new variables
						 **/
		return fraction;
	}

	public boolean isEqualTo(Fraction frac) { // method syntax

		// check if field num = param num and field denom = param denom
		return (numerator == frac.numerator && denominator == frac.denominator);

	}

	public String toString() { // method syntax

		String numAndDenom = numerator + "/" + denominator; // create and return
															// string
		return numAndDenom;
	}

	private int gcd(int num, int denom) {

		int gcd = 1; // as 1 divides all integers, so we will start our gcd from 1

		if (num == 0 || denom == 0) { // if num or denom is zero method will not work
			return num & denom;
		}

		if (num < 0) { // if num or denom will be negative, we will chang it into
						// positive
						// for performing next task, otherwise loop will not run
			num = -num;
		}
		if (denom < 0) {
			denom = -denom;
		}

		for (int i = 2; i <= num && i <= denom; i++) { //we will start loop from 2 to find common divisor and run it up to num and denon
			if (num % i == 0 && denom % i == 0)        // if i divides both we will save that integer
				gcd = i;
		}

		return gcd;
	}

	
	private void reduceFraction() {
		
		int commonDivisor;  // create variable to stor the value which will come from gcd method
		commonDivisor = gcd(numerator, denominator);
		
		numerator = numerator / commonDivisor; // now divide num and denom with that integer
		denominator = denominator / commonDivisor;
	}

}