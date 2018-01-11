using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.IO.Basics_of_IO
{
    class Seating_Arrangement
    {
        static void Main()
        {
            int T = int.Parse(Console.ReadLine());

            Dictionary<int, string> seats = new Dictionary<int, string>();
            string[] sides = new string[] { "WS", "MS", "AS", "AS", "MS", "WS" };
            for (int i = 1, j = 11; i <= 6; i++, j -= 2)
            {
                seats.Add(i, sides[i - 1]);
                seats.Add(i + j, sides[i - 1]);
            }

            for (int i = 0; i < T; i++)
            {
                int N = int.Parse(Console.ReadLine());

                int count = 0;

                while (N > 12)
                {
                    N -= 12;
                    count++;
                }

                string s = "";
                seats.TryGetValue(N, out s);
                Console.WriteLine("{0} {1}", (13 - N) + count * 12, s);
            }

        }
    }
}
