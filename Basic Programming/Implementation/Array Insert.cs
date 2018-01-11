using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.Implementation
{
    class Array_Insert
    {
        static void Main()
        {
            int[] tokens = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int N = tokens[0];
            int Q = tokens[1];

            int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            for (int i = 0; i < Q; i++)
            {
                int[] query = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);


                try
                {
                    if (query[0] == 1)
                    {
                        arr[query[1]] = query[2];
                    }
                    else
                    {
                        int sum = 0;
                        for (int j = query[1]; j <= query[2]; j++)
                        {
                            sum += arr[j];
                        }

                        Console.WriteLine(sum);
                    }
                }
                catch (IndexOutOfRangeException e)
                {
                    Console.WriteLine(-1);
                }
            }
        }
    }
}
