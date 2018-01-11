using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerEarth.Basic_Programming.IO.Basics_of_IO
{
    class Cipher
    {
        static void Main()
        {
            string s = Console.ReadLine();
            int temp = int.Parse(Console.ReadLine());

            int numeric_Key = temp > 10 ? temp % 10 : temp;
            int alpha_Key = temp > 26 ? temp % 26 : temp;

            string cipher = "";
            foreach (char c in s)
            {
                if (Char.IsNumber(c))
                {
                    cipher += c + numeric_Key > 57 ? (char)(c + numeric_Key - 57 + 47) : (char)(c + numeric_Key);
                }
                else if (Char.IsLetter(c))
                {
                    if (char.IsLower(c))
                    {
                        cipher += c + alpha_Key > 122 ? (char)(c + alpha_Key - 122 + 96) : (char)(c + alpha_Key);
                    }
                    else
                    {
                        cipher += c + alpha_Key > 90 ? (char)(c + alpha_Key - 90 + 64) : (char)(c + alpha_Key);
                    }
                }
                else
                {
                    cipher += c;
                }
            }
        }
    }
}
