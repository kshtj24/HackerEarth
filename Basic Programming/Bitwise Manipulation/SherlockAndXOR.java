import java.io.*;
import java.util.*;

//XOR result for two numbers is odd when one of them is even and other is odd. As 1 ^ 0 = 1
class SherlockAndXOR{
    public static void main(String[] args){
		try{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			while(T-- > 0){
				int N = Integer.parseInt(br.readLine());
				int[] arr = convertAll(br.readLine().split(" "));
				
				long evensNums = 0;
				long oddNums = 0;
				for(int i : arr){
					if( (i & 1) == 1)
						oddNums++;
					else
						evensNums++;
				}
				
				System.out.println(evensNums * oddNums);
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