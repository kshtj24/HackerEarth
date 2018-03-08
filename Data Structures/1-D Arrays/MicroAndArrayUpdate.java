import java.util.*;

class MicroAndArrayUpdate{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int T = Integer.parseInt(s.nextLine());
		while(T-- > 0){
			int[] N_K = convertAll(s.nextLine().split(" "));
			int[] arr = convertAll(s.nextLine().split(" "));
			int temp = N_K[1] - findMin(arr)
			System.out.println(temp <= 0 ? 0 : temp);
		}
	}
	
	static int findMin(int[] arr){
		int min = Integer.MAX_VALUE;
		for(int i : arr){
			if(min > i)
				min = i;
		}
		
		return min;
	}
	
	static int[] convertAll(String[] arr){
		int[] returnable = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			returnable[i] = Integer.parseInt(arr[i]);
		}
		
		return returnable;
	}
}