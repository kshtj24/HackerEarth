using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.IO.Basics_of_IO
{
    class Palindromic_String
    {
        void Main()
        {
            string initialString = Console.ReadLine();
            Stack<char> temp = new Stack<char>();

            foreach(char c in initialString)
            {
                temp.Push(c);
            }

            string finalString = "";

            while(temp.Count > 0)
            {
                finalString += temp.Pop();
            }

            Console.WriteLine(initialString.Equals(finalString) ? "YES" : "NO");

        }
    }
}
