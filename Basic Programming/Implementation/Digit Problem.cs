using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.Implementation
{
    class Digit_Problem
    {
        static void Main()
        {
            string[] tokens = Console.ReadLine().Split(' ');

            string X = tokens[0].ToString();
            int K = int.Parse(tokens[1]);

            string max = "";

            for (int i = 0; i < X.Length; i++)
            {
                if (X[i] != '9' && K > 0)
                {
                    max += '9';
                    K--;
                }
                else
                {
                    max += X[i];
                }
            }

            Console.WriteLine(max);
        }
    }
}
