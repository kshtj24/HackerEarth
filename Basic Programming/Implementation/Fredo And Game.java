import java.util.*;

class FredoAndGame{
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int T = Integer.parseInt(s.nextLine());
		for(int t = 0; t < T; t++){
			
			int A = Integer.parseInt(s.nextLine().split(" ")[0]);
			int[] obstacleArr = convertAll(s.nextLine().split(" "));
			
			int location = -1;
			for(int i = 0; i < obstacleArr.length; i++){
				A -= obstacleArr[i] == 0 ? 1 : -2;
				
				if( A == 0 && i != (obstacleArr.length - 1) ){
					A = -1;
					location = i;
					break;
				}
			}
			
			System.out.println( A == -1 ? "No " + (location + 1) : "Yes " + A);
		}
	}
	
	static int[] convertAll(String[] values){
		int[] returnable = new int[values.length];
		
		for(int i = 0; i < values.length; i++){
			returnable[i] = Integer.parseInt(values[i]);
		}
		
		return returnable;
	}
}