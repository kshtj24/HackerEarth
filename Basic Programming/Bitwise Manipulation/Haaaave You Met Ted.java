import java.io.*;

class HaaaaveYouMetTed{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			while(T-- > 0){
				long N = Integer.parseInt(br.readLine());
				long[] arr = convertAll(br.readLine().split(" "));
				long minHammingDistance = Integer.MAX_VALUE;
				
				for(int i = 0; i < N; i++){
					long temp = Long.bitCount(arr[i]);
					if(temp < minHammingDistance)
						minHammingDistance = temp;
				}
				System.out.println(minHammingDistance);
			}
		}catch(IOException ex){}
	}
	
	static long[] convertAll(String[] arr){
		long[] returnable = new long[arr.length];
		for(int i = 0; i < arr.length; i++){
			returnable[i] = Long.parseLong(arr[i]);
		}
		return returnable;
	}
}