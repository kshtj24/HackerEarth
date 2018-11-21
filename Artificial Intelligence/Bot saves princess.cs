using System;
using System.Collections.Generic;
using System.IO;
class Solution {
static void displayPathtoPrincess(int n, String[] grid)
        {
            int[] mPosition = new int[2];
            int[] pPosition = new int[2];

            for (int i = 0; i < grid.Length; i++)
            {
                for (int j = 0; j < grid[i].Length; j++)
                {
                    if (grid[i][j] == 'm')
                    {
                        mPosition[0] = i;
                        mPosition[1] = j;
                    }
                    else if (grid[i][j] == 'p')
                    {
                        pPosition[0] = i;
                        pPosition[1] = j;
                    }
                }
            }
            
            //Moving vertically
            if (mPosition[0] < pPosition[0])
            {
                for (int k = mPosition[0]; k < pPosition[0]; k++)
                {
                    Console.WriteLine("DOWN");
                }
            }
            else
            {
                for (int k = mPosition[0]; k > pPosition[0]; k--)
                {
                    Console.WriteLine("UP");
                }
            }

            //Moving sideways
            if (mPosition[1] < pPosition[1])
            {
                for (int k = mPosition[1]; k < pPosition[1]; k++)
                {
                    Console.WriteLine("RIGHT");
                }
            }
            else
            {
                for (int k = mPosition[1]; k > pPosition[1]; k--)
                {
                    Console.WriteLine("LEFT");
                }
            }
           
            Console.ReadKey();

        }
static void Main(String[] args) {
        int m;

        m = int.Parse(Console.ReadLine());

        String[] grid  = new String[m];
        for(int i=0; i < m; i++) {
            grid[i] = Console.ReadLine(); 
        }

        displayPathtoPrincess(m,grid);
     }
}
