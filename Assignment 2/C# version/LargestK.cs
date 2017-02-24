using System;

class LargestK
{
	public static void Main(string[] args)
	{
		Console.Write("Give a positive integer: ");
		int input = Convert.ToInt32(Console.ReadLine());

		int sum = 0;
		int k = 0;

		while (sum < input)
		{
			sum += k + 2;
			k += 2;
		}
		k -= 2;
		Console.WriteLine("The largest K such that 0 + 2 + 4 + 6 +...+ K < " + input + " => K = " + k);
	}
}

