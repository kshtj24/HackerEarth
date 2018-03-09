/*
	Array occurenceArray is initialized with the maximum value we can encounter in input. 
	NOTE - this code passes the sample test case but needs more improvement to pass the main test case
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class LastOccurence {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			int n = Integer.parseInt(br.readLine());
			String[] arr = br.readLine().split(" ");
			int[] occurenceArray = new int[1000001];
			
			for(int i = n - 1; i >= 0; i++){
				int loc = Integer.parseInt(arr[i]);				
				if(occurenceArray[loc] == 0)
					occurenceArray[loc] = i;				
			}
			
			int q = Integer.parseInt(br.readLine());
			while(q-- > 0){
			    int val = Integer.parseInt(br.readLine());
				int result = occurenceArray[val];
				System.out.println(result == 0 ? -1 : (result + 1));
			}
		}
    }
}