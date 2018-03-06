import java.util.*;

class StringSum{
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		char[] s = s.nextLine().toCharArray();
		
		int weight = 0;
		for(char c : s){
			weight += ((int) c - 96);
		}
		
		System.out.println(weight);
	}
}