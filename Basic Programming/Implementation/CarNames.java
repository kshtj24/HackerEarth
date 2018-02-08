import java.util.*;
class CarNames{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.nextLine());
		
		for(int n = 0; n < N; n++){			
			String str = s.nextLine();
			char[] distinctChars = getDistinctCharacter(str);
			if(distinctChars.length == 3){
				int stringSum = 0;
				int distinctSum = 0; 
				char[] strChars = str.toCharArray();
				for(char c : strChars){
					stringSum += (int)c;
				}
				for(char c : distinctChars){
					distinctSum += c;
				}
				
				if(stringSum % distinctSum == 0)
					System.out.println("OK");
				else
					System.out.println("Not OK");
			}
			else{
				System.out.println("Not OK");
			}
		}
	}
	
	static char[] getDistinctCharacter(String str){
		char[] arr = str.toCharArray();
		String temp = "";
		for(char c : arr){
			if(!contains(temp, c))
				temp += c;
		}
		
		return temp.toCharArray();
	}
	
	static boolean contains(String str, char c){
		char[] arr = str.toCharArray();
		for(char ch : arr){
			if(ch == c)
				return true;
		}
		return false;
	}
}