using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {
 static void next_move(int posr, int posc, string[] board)
        {
            for (int count = 0; count < board.Length; count++)
            {
                if ((board[count].ToCharArray()).Contains('d'))
                {
                    goto MoreCode;
                }

                      
            }

       Console.WriteLine("DOWN");       
     
            MoreCode:
            {
                if (board[posr][posc] == 'd')
                {
                    Console.WriteLine("CLEAN");
                }

                else
                {
                    for (int i = 0; i < board.Length; i++)
                    {
                        for (int j = 0; j < board.Length; j++)
                        {
                            if (board[i][j] == 'd')
                            {
                                if (!posr.Equals(i))
                                {
                                    if (posr < i)
                                    {
                                        Console.WriteLine("DOWN");
                                        return;
                                    }
                                    else if (posr > i)
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
            }
        }
static void Main(String[] args) {
        String temp = Console.ReadLine();
        String[] position = temp.Split(' ');
        int[] pos = new int[2];
        String[] board = new String[5];
        for(int i=0;i<5;i++) {
            board[i] = Console.ReadLine();
        }
        for(int i=0;i<2;i++) pos[i] = Convert.ToInt32(position[i]);
        next_move(pos[0], pos[1], board);
    }
}
