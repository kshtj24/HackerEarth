import java.util.*;

class MysteryEasy{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()){
			long n = Long.parseLong(s.nextLine());
			System.out.println((long)Math.pow(2,findFirstBitSet(n) - 1));
		}
	}
	
	static int findFirstBitSet(long n){
		int count = 0;
		while( n > 0){	
			count++;		
			if(n % 2 == 1)
				return count;			
			n /= 2;
			
		}	
		
		return count;
	}
}