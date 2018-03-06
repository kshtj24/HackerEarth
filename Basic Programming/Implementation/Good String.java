import java.util.*;
class GoodString{
	public static void main(String[] arg){
		
		Scanner s = new Scanner(System.in);
		char[] str = s.nextLine().toCharArray();
		
		String goodString = "";
		for(char c : str){
			if(contains(c, goodString.toCharArray()))
				goodString += c;
		}
		
		System.out.println(str.length - goodString.length());
	}
	
	static boolean contains(char c, char[] str){
		for(char ch : str){
			if(ch == c){
				return false;
			}
		}
		return true;
	}
	
}