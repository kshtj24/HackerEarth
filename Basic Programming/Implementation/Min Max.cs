using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.Implementation
{
    class Min_Max
    {
        static void Main()
        {
            int N = int.Parse(Console.ReadLine());
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            Array.Sort(arr);

            Console.WriteLine(check(arr) ? "YES" : "NO");
        }

        static bool check(int[] arr)
        {
            for (int i = 1; i < arr.Length; i++)
            {
                if (arr[i] - arr[i - 1] > 1)
                    return false;
            }
            return true;
        }
    }
}
