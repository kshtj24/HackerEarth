using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.IO.Basics_of_IO
{
    class Toggle_String
    {
        static void Main()
        {
            string s = Console.ReadLine();
            string toggle = "";

            foreach (char c in s)
            {
                toggle += ((int)c) <= 90 ? (char)((int)c + 32) : (char)((int)c - 32);
            }
            Console.WriteLine(toggle);
        }
    }
}
