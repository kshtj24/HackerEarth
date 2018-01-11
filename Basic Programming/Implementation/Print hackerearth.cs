using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.Implementation
{
    class Print_hackerearth
    {
        static void Main()
        {
            int N = int.Parse(Console.ReadLine());
            string s = Console.ReadLine().ToLower();

            int h = 0, a = 0, c = 0, k = 0, e = 0, r = 0, t = 0;
            foreach (char ch in s)
            {
                switch (ch)
                {
                    case 'h':
                        h++;
                        break;
                    case 'a':
                        a++;
                        break;
                    case 'c':
                        c++;
                        break;
                    case 'k':
                        k++;
                        break;
                    case 'e':
                        e++;
                        break;
                    case 'r':
                        r++;
                        break;
                    case 't':
                        t++;
                        break;
                }
            }

            int count = 0;
            while (h >= 2 && a >= 2 && c >= 1 && k >= 1 && e >= 2 && r >= 2 && t >= 1)
            {
                h -= 2; a -= 2; c--; k--; e -= 2; r -= 2; t--;
                count++;
            }
            Console.WriteLine(count);
        }
    }
}
