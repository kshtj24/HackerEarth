import java.util.*;

class StrangeAddition{
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int T = Integer.parseInt(s.nextLine());
		for(int t = 0; t < T; t++){
			
			String[] values = s.nextLine().split(" ");
			int value1 = Integer.parseInt(reverse(values[0].toCharArray()));
			int value2 = Integer.parseInt(reverse(values[1].toCharArray()));			
			String sum = Integer.toString(value1 + value2);
			
			System.out.println(reverse(sum.toCharArray()).replaceFirst("^0+(?!$)", ""));
		}
	}
	
	static String reverse(char[] arr){
		String reversed = "";
		
		for(char c : arr){
			reversed = c + reversed;
		}
		return reversed;
	}
}