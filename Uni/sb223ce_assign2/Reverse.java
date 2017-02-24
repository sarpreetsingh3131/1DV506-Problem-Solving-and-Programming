package sb223ce_assign2;

public class Reverse {

	public static void main(String[] args) {

		char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 's', 'i', 'h', 'T' };
		System.out.println(text);

		int endPosition = 13;     /* length of char text. Need it for swapping */

		/*Start loop from 0 up to less than half of the length of 'char text'
		 * because we are swapping the Characters and when loop will reach up
		 * to half position, all the Character are already swapped with each.
		 * If we go all the way up to end, characters will again go back
		 * to their initial position.*/
		
		char temp;  /*We will use it to store the character temporarily */
		
		for (int i = 0; i < text.length / 2; i++) {

			temp = text[i];  /* Save the character at position i from text in
								 'temp' variable */

			text[i] = text[endPosition- i];      
			                 
			/*Now text[i] position is free and we can save the
		     Character from 'end position - i' in it, so that we do not
			 loose it.*/

			text[endPosition - i] = temp; /* Now swap the Characters */

		}
		System.out.println(text);

	}
}