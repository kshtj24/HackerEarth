import java.util.*;

class FunAtCakeShop{
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);		
		int X = s.nextInt();
		
		for(int i = 1; i < X; i++){
			X -= i;
			if(i >= X){
				System.out.println("Darshan");
				break;
			}else{
				X -= i;
			}
			X -= (i * i);
			if((i * i) >= X){
				System.out.println("Chandan");
				break;
			}else{
				X -= (i*i);
			}
		}
	}
}