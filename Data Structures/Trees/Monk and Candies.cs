using System;
using System.Linq;

class Monk_and_Candies
{
    public static void Main(String[] args)
    {
        int T = int.Parse(Console.ReadLine());

        for (int t = 0; t < T; t++)
        {
            int[] NnK = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int N = NnK[0];
            int K = NnK[1];

            int[] candies = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);


            int eaten = 0;

            Array.Sort(candies);

            while (K > 0)
            {

                eaten += candies[candies.Length - 1];
                K--;
            }
           

            Console.WriteLine(eaten);
        }
    }
}