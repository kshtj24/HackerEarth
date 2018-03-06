import java.util.*;

class AdditionAintSimple{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int T = Integer.parseInt(s.nextLine());
		
		for(int t = 0; t < T; t++){			
			
			char[] input  = (s.nextLine()).toCharArray();
			char[] reverse = reverseString(input);
			String result = "";
			
			for(int i = 0; i < input.length; i++){
				
			}
			System.out.println(result);
		}			
	}
	
	static char[] reverseString(char[] input){
		String reverse = "";
		
		for(int i = input.length - 1; i >=0; i--){
			reverse+= input[i];
		}
		
		return reverse.toCharArray();
	}
}