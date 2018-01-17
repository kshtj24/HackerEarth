using System;

class Count_Numbers
{

    static void Main()
    {
        int T = int.Parse(Console.ReadLine());

        for (int t = 0; t < T; t++)
        {            
            int len = int.Parse(Console.ReadLine());
            string s = Console.ReadLine();

            string e = "";
            bool isLastDigit = false;
            foreach (char c in s)
            {
                if (Char.IsDigit(c))
                {
                    e += c;
                    isLastDigit = true;
                }
                if (Char.IsLetter(c) && isLastDigit)
                {
                    e += ' ';
                    isLastDigit = false;
                }
            }
            e = e.Trim(' ');
            Console.WriteLine(e.Split(' ').Length);        
        }
    }
}