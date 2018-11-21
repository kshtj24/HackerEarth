using System;
using System.Collections.Generic;
using System.IO;

class Solution {
 static void Main(String[] args)
        {
            
            String temp = Console.ReadLine();
            String[] position = temp.Split(' ');
            int[] pos = new int[2];
            String[] board = new String[5];


            for (int i = 0; i < 5; i++)
            {
                board[i] = Console.ReadLine();
            }

            for (int i = 0; i < 2; i++)
            {
                pos[i] = Convert.ToInt32(position[i]);
            }

            next_move(pos[0], pos[1], board);
            Console.ReadKey();
        }

        static void next_move(int posr, int posc, string[] board)
        {
            if (board[posr][posc] == 'd')
            {
                Console.WriteLine("CLEAN");
            }

            else
            {
                function(posr, posc, board);
            }
        }

        static void function(int posr, int posc, String[] board)
        {
            for (int i = 0; i < board.Length; i++)
            {
                for (int j = 0; j < board.Length; j++)
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
}
