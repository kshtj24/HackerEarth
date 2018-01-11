using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.Implementation
{
    class Array_Sum
    {
        static void Main()
        {
            int n = int.Parse(Console.ReadLine());
            UInt64[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), UInt64.Parse);

            UInt64 sum = 0;
            for (int i = 0; i < n; i++)
            {
                sum += arr[i];
            }

            Console.WriteLine("{0}", sum);
        }
    }
}
