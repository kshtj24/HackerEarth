using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.IO.Basics_of_IO
{
    class Prime_Number
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            Console.Write("2");

            for (int i = 3; i <= n; i += 2)
            {
                Console.Write(checkForPrime(i) ? " {0}" : "", i);
            }
            Console.ReadKey();
        }

        static bool checkForPrime(int i)
        {
            for (int j = 3; j < i / 2; j++)
            {
                if ((i % j).Equals(0))
                    return false;
            }
            return true;
        }
    }
}

