using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.Implementation
{
    class The_Great_Kian
    {
        static void Main()
        {
            int n = int.Parse(Console.ReadLine());
            long[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), long.Parse);

            long value1 = 0, value2 = 0, value3 = 0;
            try
            {
                for (int i = 0, j = 1, k = 2; i < arr.Length || j < arr.Length || k < arr.Length; i += 3, j += 3, k += 3)
                {
                    value1 += arr[i];
                    value2 += arr[j];
                    value3 += arr[k];
                }
            }
            catch (IndexOutOfRangeException e)
            {

            }
            Console.WriteLine("{0} {1} {2}", value1, value2, value3);
        }
    }
}
