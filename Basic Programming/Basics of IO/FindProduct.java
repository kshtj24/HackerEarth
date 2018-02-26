import java.util.Scanner;

class FindProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long M = 1000000007;
		long answer = 1;
		
		for (int i = 0; i <= N - 1 ; i++){
			A[i] = sc.nextLong();
			answer = (answer * A[i]) % M;
		}
		System.out.println(answer);
	}
}