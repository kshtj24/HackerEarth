import java.io.*;
import java.util.*;

//instead of taking the numbers from the input, directly take the number of set bits in the number. sort the array in //decreasing order and take the sum of first K values.
class MonksChoiceOfNumbers{
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int T = Integer.parseInt(s.nextLine());
		while(T-- > 0){
			int N  = s.nextInt();
			int K = s.nextInt();
			s.nextLine();
			int[] arr = new int[N];
			for(int i = 0; i < N ; i++){
				arr[i] = Integer.bitCount(s.nextInt()); 
			}
			
			arr = sortArray(arr);
			
			int result = 0;
			for(int k = 0; k < K; k++){
				result += arr[k];
			}
			
			System.out.println(result);
		}
    }
	
	static int[] sortArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}