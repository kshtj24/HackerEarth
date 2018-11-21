using System;
using System.Collections.Generic;
using System.IO;

class Solution {
   static void next_move(int posr, int posc, int dimh, int dimw, string[] board)
        {
            if (board[posr][posc] == 'd')
            {
                Console.WriteLine("CLEAN");
            }

            else
            {
                function(posr, posc, dimh, dimw, board);
            }
        }

        static void function(int posr, int posc, int dimh, int dimw, String[] board)
        {
            for (int i = 0; i < dimh; i++)
            {
                for (int j = 0; j < dimw; j++)
                {
                    if (board[i][j] == 'd')
                    {
                        if (!posr.Equals(i))
                        {
                            if(posr < i)
                            {
                                Console.WriteLine("DOWN");
                                return;
                            }
                            else if(posr > i)
                            {
                                Console.WriteLine("UP");
                                return;
                            }
                        }

                        else if (posr.Equals(i))
                        {
                            if (posc < j)
                            {
                                Console.WriteLine("RIGHT");
                                return;
                            }
                            else if (posc > j)
                            {
                                Console.WriteLine("LEFT");
                                return;
                            }
                        }
                    }
                }
            }           
        }
static void Main(String[] args) {
        String temp = Console.ReadLine();
        String[] position = temp.Split(' ');
        int[] pos = new int[2];
        for(int i=0;i<2;i++) pos[i] = Convert.ToInt32(position[i]);
        String[] dimension = Console.ReadLine().Split(' ');
        int[] dim = new int[2];
        for(int i=0;i<2;i++) dim[i] = Convert.ToInt32(dimension[i]);
        String[] board = new String[dim[0]];
        for(int i=0;i<dim[0];i++) {
            board[i] = Console.ReadLine();
        }
        next_move(pos[0], pos[1],dim[0], dim[1], board);
    }
}
