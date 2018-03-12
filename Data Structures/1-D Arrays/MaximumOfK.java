import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MaximumOfK {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = br.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int K = Integer.parseInt(tokens[1]);
		int[] arr = convertAll(br.readLine().split(" "));
		for(int i = 0;i <= N - K;i++){
			int max = arr[i];
			for(int j = i;j< i+K ;j++){
				if(arr[j]>max){
					max = arr[j];
				}
			}
			System.out.print(max+" ");
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