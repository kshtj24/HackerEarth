import java.util.Scanner;

class CoinGame{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for(int T = 0; T < t; T++){
			int N = Integer.parseInt(s.nextLine());
			int[] coinPiles = convertAll(s.nextLine().split(" "));
			
			System.out.println(possibleTurns(coinPiles) % 2 == 0 ? "Alan" : "Charlie");
		}
	}
	
	static int possibleTurns(int[] values){
		int count = 0;
		for(int i : values){
			if(i % 2 == 0){
				count += (i/2);
			}
		}
		
		return count;
	}
	
	static int[] convertAll(String[] values){
		int[] returnable = new int[values.length];
		for(int i = 0; i < values.length; i++){
			returnable[i] = Integer.parseInt(values[i]);
		}
		return returnable;
	}
}