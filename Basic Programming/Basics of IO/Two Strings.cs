using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.IO.Basics_of_IO
{
    class Two_Strings
    {
        static void Main()
        {
            int T = int.Parse(Console.ReadLine());

            for (int j = 0; j < T; j++)
            {
                string[] s = Console.ReadLine().Split(' ');

                string a = SortString(s[0]);
                string b = SortString(s[1]);

                Console.WriteLine(a.Equals(b) ? "NO" : "YES");
            }
        }

        static string SortString(string input)
        {
            char[] characters = input.ToCharArray();
            Array.Sort(characters);
            return new string(characters);
        }
    }
}
