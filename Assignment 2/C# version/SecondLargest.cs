using System;

class SecondLargestS
{
	public static void Main(string[] args)
	{
		Console.Write("Provide 10 integer: ");
		int secondLargest = 0;
		int largest = 0;

		for (int i = 0; i < 10; i++)
		{
			int input = Convert.ToInt32(Console.ReadLine());

			if (input > largest)
			{
				secondLargest = largest;
				largest = input;
			}
			else if (input < largest && input > secondLargest)
			{
				secondLargest = input;
			}
		}
		Console.WriteLine("The second largest is: " + secondLargest);
	}
}