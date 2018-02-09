import java.util.*;

class JumpOut{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.nextLine());
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = s.nextInt();
		}
				
		for(int i = 0; i < N; i++){
			if(i + A[i] >= N){
				System.out.println(i+1);
				break;
			}
		}
	}
	
	
}