using System;

class ShortName
{
	public static void Main(string[] args)
	{
		Console.Write("First Name: ");
		string fName = Console.ReadLine();
		Console.Write("Last Name: ");
		string lName = Console.ReadLine();
		string sName = fName[0] + ". " + lName.Substring(0, 4);
		Console.WriteLine("Short Name: " + sName);
	}
}

