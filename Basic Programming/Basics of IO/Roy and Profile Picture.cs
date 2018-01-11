using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.IO.Basics_of_IO
{
    class Roy_and_Profile_Picture
    {
        static void Main(string[] args)
        {
            int L = int.Parse(Console.ReadLine());
            int N = int.Parse(Console.ReadLine());

            for (int i = 0; i < N; i++)
            {
                int[] temp = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

                if (temp[0] == temp[1] && temp[0] >= L)
                    Console.WriteLine("ACCEPTED");
                else
                    Console.WriteLine((temp[0] < L || temp[1] < L) ? "UPLOAD ANOTHER" : "CROP IT");
            }
        }
    }
}
