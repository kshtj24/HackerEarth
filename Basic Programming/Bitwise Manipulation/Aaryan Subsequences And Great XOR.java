import java.io.*;
import java.util.*;

class AaryanSubsequencesAndGreatXOR{
    public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			int[] sequence = convertAll(br.readLine().split(" "));
			int result = 0;
			for(int i : sequence){
				result |= i;				
			}
			System.out.println(result);
		
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