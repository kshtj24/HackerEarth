import java.util.*;

class SumOfNumbers{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int T = Integer.parseInt(s.nextLine());
		while(T-- > 0){
			int n = Integer.parseInt(s.nextLine());
			int[] set = convertAll(s.nextLine().split(" "));
			int sum = Integer.parseInt(s.nextLine());
			boolean flag = false;
			 for (int i = 0; i < (1<<n); i++){
				int temp = 0;
				for (int j = 0; j < n; j++){
					if ((i & (1 << j)) > 0)
						temp += set[j];
				}
				if(temp == sum){
					System.out.println("YES");
					flag = true;
					break;
				}
			}
			if(!flag)
				System.out.println("NO");
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