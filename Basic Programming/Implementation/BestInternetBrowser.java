import java.util.*;

class BestInternetBrowser{
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int tc = Integer.parseInt(s.nextLine());		
		
		for(int t = 0; t < tc; t++){
			String url = s.nextLine();
			String condensedString = getCondensedString(url.toCharArray());
			System.out.println((condensedString.length()+ 3) + "/" + url.length()); //adding com character that were ignored
		}
	}
	
	static String getCondensedString(char[] url){
		String condensedString = "";
		for(int i = 3; i < url.length - 4; i++){
			if(!(url[i] == 'a' || url[i] == 'e' || url[i] == 'i' || url[i] == 'o' || url[i] == 'u'))
				condensedString += url[i];
		}
		return condensedString;
	}
}