import java.util.*;

class XorAndProject{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		long N = s.nextLong();
		for(long x = 0L; ; x++){
			if((x ^ (x >> 1)) == N){
				System.out.println(x);
				break;
			}
		}
	}
}