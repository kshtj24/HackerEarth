import java.io.BufferedReader;
import java.io.InputStreamReader;

class LongATMQueue {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] heights = convertAll(br.readLine().split(" "));
		
		int minCount = 1;
		for(int i = 1; i < N; i++){
			if((heights[i] - heights[i - 1]) < 0)
				minCount++;
		}
		
		System.out.print(minCount);
    }
	
	static int[] convertAll(String[] arr){
		int[] returnable = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			returnable[i] = Integer.parseInt(arr[i]);
		}
		
		return returnable;
	}
}
