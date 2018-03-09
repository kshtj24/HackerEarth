import java.io.*;

class MemoriseMe{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = countOccurences(br.readLine().split(" "));
		int Q = Integer.parseInt(br.readLine());

		while(Q-- > 0){
			int val = Integer.parseInt(br.readLine());
			int result = arr[val];
			System.out.println(result == 0 ? "NOT PRESENT" : result);
		}
	}

	static int[] countOccurences(String[] args){
		int[] returnable = new int[1001];
		for(String s : args){
			int temp = Integer.parseInt(s);
			returnable[temp]++;
		}
		
		return returnable;
	}
}