using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.Implementation
{
    class Pradyumn_And_Cyclic_Strings
    {
        static void Main(string[] args)
        {
            int T = int.Parse(System.Console.ReadLine());

            for (int j = 0; j < T; j++)
            {
                string s = System.Console.ReadLine();
                long sum = 0;
                for (int i = 1; i <= s.Length; i++)
                {
                    sum = sum + i;
                }
                System.Console.WriteLine(sum);
            }
        }
    }
}
