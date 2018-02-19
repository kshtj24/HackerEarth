import java.io.*;
import java.util.*;

//XORing all values with each other. Given that there is only one number which occurs in odd frequency. Means that all the other numbers will be in even frequency. Thus when XORing all values. Only the oddly occurring number remains.
class RajAndOddFrequencyNumber{
    public static void main(String[] args){
		try{
			    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int n = Integer.parseInt(br.readLine());
				int[] a = convertAll(br.readLine().split(" "));
				int tempXOR = 0;
				for(int i = 0; i < a.length; i++){
				    tempXOR ^= a[i];
				}
				System.out.println(tempXOR);
		
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