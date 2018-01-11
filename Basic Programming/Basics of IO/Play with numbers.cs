using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.IO.Basics_of_IO
{
    class Play_with_numbers
    {
        static void Main()
        {
            int[] N_Q = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            long sum = 0;
            long[] sumArr = new long[] { };

            for (int i = 0; i < arr.Length; i++)
            {
                sumArr[i] = sum + arr[i];
            }

            for (int i = 0; i < N_Q[1]; i++)
            {
                int[] L_R = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

                Console.WriteLine((sumArr[L_R[1]] - sumArr[L_R[0]]) / (L_R[1] - L_R[0]));
            }


        }
    }
}
