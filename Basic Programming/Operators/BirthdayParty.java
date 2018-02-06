import java.util.*;

class BirthdayParty{
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int T = Integer.parseInt(s.nextLine());
		for(int t = 0; t < T; t++){
			int[] values = convertAll(s.nextLine().split(" "));
			System.out.println(values[1] % values[0] == 0? "Yes":"No");
		}
	}
	
	static int[] convertAll(String[] arr){
		int[] returnable = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			returnable[i] = Integer.parseInt(arr[i]);
		}
		return returnable;
	}
}