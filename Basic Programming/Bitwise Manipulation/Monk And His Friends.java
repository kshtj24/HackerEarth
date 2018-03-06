import java.io.*;
import java.util.*;

class MonkAndHisFriends{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int T = Integer.parseInt(s.nextLine());
		while(T-->0){
			long M = s.nextLong();
			long P = s.nextLong();
			
			long result = Long.bitCount( M ^ P);
			
			System.out.println(result);
		}
	}
}