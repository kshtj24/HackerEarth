import java.util.*;

class NQueens{
	
	static int N;
	
	public static void main(String args[] ) throws Exception {
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		solveNQ(N);
		}
		
	static void printSolution(int board[][]){
		for (int i = 0; i < N; i++){
			for (int j = 0; j < N; j++)
				System.out.print(board[j][i]+ " ");
			System.out.println();
		}
	}
	static boolean isSafe(int board[][],int row, int col) {
		int i, j;
		for (i=0;i<col;i++)
			if(board[row][i]==1)
				return false;
		for (i=row, j=col; j>=0 && i<N; i++, j--)
			if (board[i][j] == 1)
				return false;
		for (i=row, j=col; i>=0 && j>=0; i--, j--)
			if (board[i][j] == 1)
				return false;
		return true;
	}
	static boolean solveNQUtil(int board[][], int col){
		if (col >= N)
			return true;
		for (int i = 0; i < N; i++){
			if (isSafe(board, i, col)){
				board[i][col] = 1;
				if (solveNQUtil(board, col + 1) == true)
					return true;
				board[i][col] = 0; 
			}
		}
		return false;
	}

	static boolean solveNQ(int n){
		int[][] board = new int[n][n];
		if (solveNQUtil(board, 0) == false){
			System.out.print("Solution does not exist");
			return false;
		}
		printSolution(board);
		return true;
	}
}