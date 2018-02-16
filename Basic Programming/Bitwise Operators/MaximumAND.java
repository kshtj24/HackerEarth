import java.io.*;
import java.util.*;

class MaximumAND{
    public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int T = Integer.parseInt(s.nextLine());
		for(int t = 0; t < T; t++){
			long A = s.nextLong();
			long B = s.nextLong();
			long temp = 0;
			if((B & 1) == 1){
				temp = (B - 1);
			}else{
				temp = (B - 2);
			}
				
			if(temp < A || temp > B){
				temp = A & B;
			}
					
			System.out.println(temp);
		}       
    }
}