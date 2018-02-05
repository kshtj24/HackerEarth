import java.util.*;

class AniruddhasQueue{
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int T = Integer.parseInt(s.nextLine());
		for(int t = 0; t < T; t++){
			
			long N = Integer.parseInt(s.nextLine());
			long[] values = convertAll(s.nextLine().split(" "));
			long M = Integer.parseInt(s.nextLine());
			long dayNum = 0;
			int i = 0;			
			while(M > 0){
				if(i >= N){
					i = 0;
				}
				
				M -= values[i];
				dayNum++;
				i++;
			}
			System.out.println(dayNum > N ? dayNum % N : dayNum);
		}
	}
	
	static long[] convertAll(String[] arr){
		long[] returnable = new long[arr.length];
		for(int i = 0; i < arr.length; i++){
			returnable[i] = Long.parseLong(arr[i]);
		}		
		return returnable;
	}
}