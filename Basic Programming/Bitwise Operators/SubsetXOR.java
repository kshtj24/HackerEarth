import java.io.*;
import java.util.*;

class SubsetXOR{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			for(int t = 0; t < T; t++){
			    String N = br.readLine();
				int[] S = convertAll(br.readLine().split(" "));
				int XorSum = 0;
				if(S.length > 1)//if length of array greater than 1, xor is zero for all subsets
					System.out.println(0);
				else
					System.out.println(S[0]);//else if n == 1, xor is the number itself
			}
		}catch(IOException ex){
			
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