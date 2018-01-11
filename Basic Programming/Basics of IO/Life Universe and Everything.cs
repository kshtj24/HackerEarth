using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.IO.Basics_of_IO
{
    class Life_Universe_and_Everything
    {
        static void Main()
        {
            while (true)
            {
                int a = int.Parse(Console.ReadLine());
                if (a <= 42)
                    Console.WriteLine(a);
                else
                    break;
            }
        }
    }
}
