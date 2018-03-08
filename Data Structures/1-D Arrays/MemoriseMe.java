import java.io.*;

class MemoriseMe{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = convertAll(br.readLine().split(" "));
		int Q = Integer.parseInt(br.readLine());
		
		while(Q-- > 0){
			int val = Integer.parseInt(br.readLine());
			int result = countOccurences(arr, val);
			System.out.println(result == 0 ? "NOT PRESENT" : result);
		}
	}
	
	static int countOccurences(int[] arr, int val){
		int count = 0;		
		for(int i : arr){
			count += i == val ? 1 : 0;
		}
		return count;
	}
	static int[] convertAll(String[] arr){
		int[] returnable = new int[arr.length];
		for(int i=0; i<arr.length;i++){
			returnable[i] = Integer.parseInt(arr[i]);
		}
		
		return returnable;
	}
}