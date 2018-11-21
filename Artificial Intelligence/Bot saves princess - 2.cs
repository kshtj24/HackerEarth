using System;
using System.Collections.Generic;
using System.IO;
class Solution {
   static void nextMove(int n, int r, int c, String[] grid)
        {
            int[] pPosition = new int[2];
            int[] mPosition = new int[2];

            mPosition[0] = r;
            mPosition[1] = c;

            for (int i = 0; i < grid.Length; i++)
            {
                for (int j = 0; j < grid[i].Length; j++)
                {
                    if (grid[i][j] == 'p')
                    {
                        pPosition[0] = i;
                        pPosition[1] = j;
                    }
                }
            }


            //Moving vertically
            if (r < pPosition[0])
            {
                for (int k = r; k < pPosition[0]; k++)
                {
                    Console.WriteLine("DOWN");
                    goto Terminate;
                }
            }
            else
            {
                for (int k = r; k > pPosition[0]; k--)
                {
                    Console.WriteLine("UP");
                    goto Terminate;
                }
            }

            //Moving sideways
            if (c < pPosition[1])
            {
                for (int k = c; k < pPosition[1]; k++)
                {
                    Console.WriteLine("RIGHT");
                    goto Terminate;
                }
            }
            else
            {
                for (int k = c; k > pPosition[1]; k--)
                {
                    Console.WriteLine("LEFT");
                    goto Terminate;
                }
            }

            Terminate:
       {
           
       }

        }
static void Main(String[] args) {
        int n;

        n = int.Parse(Console.ReadLine());
        String pos;
        pos = Console.ReadLine();
        String[] position = pos.Split(' ');
        int [] int_pos = new int[2];
        int_pos[0] = Convert.ToInt32(position[0]);
        int_pos[1] = Convert.ToInt32(position[1]);
        String[] grid  = new String[n];
        for(int i=0; i < n; i++) {
            grid[i] = Console.ReadLine(); 
        }

        nextMove(n, int_pos[0], int_pos[1], grid);

     }
}
