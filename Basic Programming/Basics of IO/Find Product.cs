using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.IO.Basics_of_IO
{
    class Find_Product
    {
        static void Main()
        {
            int N = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            long product = 1;

            foreach (int i in arr)
            {
                product *= i % (int)(Math.Pow(10, 9) + 7);
            }

            Console.WriteLine(product); ;
        }
    }
}
