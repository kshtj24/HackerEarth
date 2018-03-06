import java.util.*;
import java.io.*;

class LuckyNumbers{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			for(int t = 0; t < T; t++){
				long N = Long.parseLong(br.readLine());
				long sum = 0;
				for(long n = 0; n <= N; n++){
					if(countSetBits(n) == 2)
						sum += (n % ((long)Math.pow(10,9) + 7));
				}
			System.out.println(sum);
			}
		}catch(IOException ioex){
			
		}
	}
	
	//implementing Brian Kernighan's algorithm for counting number of set bits
	static int countSetBits(long n){ 
		int count = 0; 
		while(n > 0){
			n &= (n - 1);
			count++;
		}
		return count;
	}
}