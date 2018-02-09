import java.util.*;

class PalindromicCiphers{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int T = Integer.parseInt(s.nextLine());
		for(int t = 0; t < T; t++){
			String str = s.nextLine();
			System.out.println(isPalindrome(str)? "Palindrome" : getCharsProduct(str));
		}
	}
	
	static long getCharsProduct(String str){
		char[] tempStr = str.toCharArray();
		long product = 1;
		for(char c : tempStr){
			product *= ((long)c - 96);
		}
		return product;
	}
	
	static boolean isPalindrome(String str){
		char[] tempStr = str.toCharArray();
		String reversedString = "";
		for(char c : tempStr){
			reversedString = c + reversedString;
		}
		if(reversedString.equals(str))
			return true;
		return false;
	}
	
}