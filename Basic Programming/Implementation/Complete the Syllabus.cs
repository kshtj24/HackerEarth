using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.Implementation
{
    class Complete_the_Syllabus
    {
        static void Main()
        {
            int T = int.Parse(Console.ReadLine());
            List<string> days = new List<string>() { "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };

            for (int j = 0; j < T; j++)
            {
                long K = long.Parse(Console.ReadLine());
                int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

                int i = -1;

                var sum = arr.Sum();

                while (K > sum) //reducing K to a smaller value so that it day by day evaluation can be done.
                {
                    K -= sum;
                }

                while (K > 0)
                {
                    i++;
                    K -= i < 7 ? arr[i] : arr[i % 7];
                }
                Console.WriteLine("{0}", i > 7 ? days[i % 7] : days[i]);
            }
        }
    }
}
