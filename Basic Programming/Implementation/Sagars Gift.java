import java.util.Scanner;

class SagarsGift{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int T = Integer.parseInt(s.nextLine());
		for(int t = 0 ; t < T; t++){
			int N = Integer.parseInt(s.nextLine());
			String tempStr = s.nextLine();		
			String str = filterString(tempStr);		
			System.out.println(sortString(str));
		}
	}
	
	static String sortString(String str){
		char[] temp = str.toCharArray();
		String sortedString = "";
		
		for(int i = 0; i < temp.length; i++){
			for(int j = i + 1; j < temp.length; j++){
				if(Character.getNumericValue(temp[i]) < Character.getNumericValue(temp[j])){
					char tmp = temp[i];
					temp[i] = temp[j];
					temp[j] = tmp;
				}
			}
		}
		
		for(char c : temp){
			sortedString += c; 
		}
		
		return sortedString;
	}
	
	static String filterString(String tempStr){
		String filteredString = "";
		char temp[] = tempStr.toCharArray();
		
		for(char c : temp){
			if(Character.isDigit(c))
				filteredString += c;
		}		
		return filteredString;
	}
}