package sb223ce_assign3;

public class TextAnalyzer {

	private String text; // field

	public TextAnalyzer(String text) { // constructor with parameter
		this.text = text; // give parameter string value to field string to
							// perform other methods

	}

	public String charCount() { // method syntax
		return "" + text.length() + ""; // change the length integer in to
										// string

	}




	
	public String upperCaseCount() { // method syntax

		int uppercase = 0; // create variable to count upper case

		for (int i = 0; i < text.length(); i++) { // run the loop

			char c = text.charAt(i); // get the character at index i and save it
										// in char c

			if (Character.isUpperCase(c)) { // check if it is upper case
				uppercase++; // add 1 if it is upper case character
			}
		}

		return "" + uppercase + ""; // return string
	}



	
	
	public String whitespaceCount() { // method syntax

		int whitespace = 0; // create variable to count lower case

		for (int i = 0; i < text.length(); i++) { // run the loop

			char c = text.charAt(i); // get the character at index i and save it
										// in char c

			if (Character.isWhitespace(c)) { // check if it is white space
				whitespace++; // add 1 if it is white space character
			}
		}

		return "" + whitespace + ""; // return string

	}


	
	
	public String digitCount() { // method syntax

		int digit = 0; // create variable to count digit

		for (int i = 0; i < text.length(); i++) { // run the loop

			char c = text.charAt(i); // get the character at index i and save it
										// in char c

			if (Character.isDigit(c)) { // check if it is digit
				digit++;
			} // add 1 if it is digit character
		}

		return "" + digit + ""; // return string

	}

	
	
	public boolean containsChar(char a) { // method syntax

		for (int i = 0; i < text.length(); i++) { // run the loop

			char ch = text.charAt(i); // get the character at index i and save
										// it in char c

			if (ch == a) { // check if it is same as parameter char a
				return true;
			}
		}
		return false;

	}
	
	
	
	public boolean containsString(String a) { // method syntax

		return text.contains(a); // check if field string contains parameter
									// string

	}

}