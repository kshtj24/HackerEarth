using System;

class Starter{
	
	static void Main()
        {
            int T = int.Parse(Console.ReadLine());

            for (int t = 0; t < T; t++)
            {
                int N = int.Parse(Console.ReadLine());
                long sum = 0;
                for (int i = 0; i <= N; i += 3)
                {
                    sum += i;
                }
                for(int i=0;i<=N;i+=5)
                {
                    if (i % 3 != 0)
                        sum += i;
                }
            }
        }
		int T = int.Parse(Console.ReadLine());
		
		for(int t=0;t<T;t++)
		{
			int N = int.Parse(Console.ReadLine());
			long sum = 0;
			for(int i = 0,j=0; i<=N || j <=N;i+=3,j+=5)
			{
				sum+= (i!=j)? i+j:i;
			}
			Console.WriteLine(sum);
		}
	}
	
}