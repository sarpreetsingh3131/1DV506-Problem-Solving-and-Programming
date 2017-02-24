using System;
using System.Collections.Generic;
using System.Linq;

class Arrays
{
	public static void Main(string[] args)
	{
		int[] arr = new int[] { 3, 2, 3, 1 };
		Console.WriteLine("Sum: " + sum(arr));
		Console.WriteLine("To String: " + toString(arr));
		Console.WriteLine("Reverse: " + toString(reverse(arr)));
		Console.WriteLine("Has N: " + hasN(arr, 1));
		replaceAll(arr, 1, 0);
		Console.WriteLine("Sort: " + toString(sort(arr)));
		Console.WriteLine("HasSubsequence: " + hasSubsequence(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5 }));
	}

	public static int sum(int[] arr)
	{
		int sum = 0;
		for (int i = 0; i < arr.Length; i++)
		{
			sum += arr[i];
		}
		return sum;
	}

	public static string toString(int[] arr)
	{
		string str = "[";
		for (int i = 0; i < arr.Length - 1; i++)
		{
			str += arr[i] + ", ";
		}
		str += arr[arr.Length - 1] + "]";
		return str;
	}

	public static int[] addN(int[] arr, int n)
	{
		int[] array = arr;
		for (int i = 0; i < array.Length; i++)
		{
			array[i] = arr[i] + n;
		}
		return array;
	}

	public static int[] reverse(int[] arr)
	{
		int[] array = arr;
		for (int i = array.Length - 1; i >= 0; i--)
		{
			array[array.Length - 1 - i] = arr[i];
		}
		return array;
	}

	public static bool hasN(int[] arr, int n)
	{
		foreach (int i in arr)
		{
			if (i == n)
			{
				return true;
			}
		}
		return false;
	}

	public static void replaceAll(int[] arr, int old, int nw)
	{
		for (int i = 0; i < arr.Length; i++)
		{
			if (arr[i] == old)
			{
				arr[i] = nw;
			}
		}
	}

	public static int[] sort(int[] arr)
	{
		int[] array = arr;
		for (int i = 0; i < array.Length; i++)
		{
			for (int j = 0; j < array.Length - 1; j++)
			{
				if (array[j] > array[j + 1])
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public static bool hasSubsequence(int[] arr, int[] sub)
	{
		for (int i = 0; i < arr.Length; i++)
		{
			if (arr[i] == sub[0])
			{
				for (int j = 0; j < sub.Length; j++)
				{
					if (i < arr.Length)
					{
						if (arr[i] != sub[j])
						{
							break;
						}
						else if (arr[i] == sub[j] && j == sub.Length - 1)
						{
							return true;
						}
					}
					i++;
				}
			}
		}
		return false;
	}
}
