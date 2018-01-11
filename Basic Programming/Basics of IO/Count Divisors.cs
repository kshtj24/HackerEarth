using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.IO.Basics_of_IO
{
    class Count_Divisors
    {
        static void Main(String[] args)
        {
            int[] inputs = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            int count = 0;
        
            for (int i = inputs[0]; i <= inputs[1]; i++)
            {
                if (i % inputs[2] == 0)
                    count++;
            }

            Console.WriteLine(count);
        }
    }
}
