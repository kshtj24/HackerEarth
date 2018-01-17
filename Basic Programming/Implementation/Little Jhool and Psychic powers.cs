using System;

class Little_Jhool_and_psychic_powers

{
	 static void Main()
        {
            string s = Console.ReadLine();

            if (s.Contains("000000") || s.Contains("111111"))
                Console.WriteLine("Sorry, sorry!");
            else
                Console.WriteLine("Good luck!");
        }
}
