using System;

class FrequencyTable
{
	public static void Main(string[] args)
	{
		Random ran = new Random();
		int[] frequency = new int[6];

		for (int i = 0; i < 6000; i++)
		{
			int num = ran.Next(6) + 1;

			switch (num)
			{
				case 1:
					frequency[0] += 1;
					break;
				case 2:
					frequency[1] += 1;
					break;
				case 3:
					frequency[2] += 1;
					break;
				case 4:
					frequency[3] += 1;
					break;
				case 5:
					frequency[4] += 1;
					break;
				case 6:
					frequency[5] += 1;
					break;
			}
		}
		Console.WriteLine("Frequencies when rolling a dice 6000 times.");

		for (int i = 0; i < frequency.Length; i++)
		{
			Console.WriteLine((i + 1) + ": " + frequency[i]);
		}
	}
}