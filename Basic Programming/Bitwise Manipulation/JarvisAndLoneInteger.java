import java.util.*;

class JarvisAndLoneInteger{
	public static void main(String[] args){
	try{
	    Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		s.nextLine();
		while(T-- != 0){
			int N = s.nextInt();
			s.nextLine();
			long result = 0;
			while( N-- != 0){
				result ^= s.nextLong();
			}
			System.out.println(result == 0? "-1" : result);
			s.nextLine();
		}
	}catch(Exception e){
	    //Try catch implemented for ill formatting of input
	}
	}
}