import java.util.Scanner;

public class CountA {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Provide a line of text: ");
        String input = scan.nextLine();
		scan.close();

        int smallA = 0;
		int bigA = 0;

        for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) == 'a')
			{
				smallA++;
			}
			else if (input.charAt(i) == 'A')
			{
				bigA++;
			}
		}
		System.out.println("Number of 'a': " + smallA);
		System.out.println("Number of 'A': " + bigA);
    }
}
