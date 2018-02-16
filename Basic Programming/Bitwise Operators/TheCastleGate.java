import java.io.*;
import java.util.*;

class TheCastleGate{
    public static void main(String[] args){
		try{
			    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int T = Integer.parseInt(br.readLine());
				for(int t = 0; t < T; t++){
					int N = Integer.parseInt(br.readLine());
					int count = 0;
					for(int i = 1; i <= N; i++){
						for(int j = i+1; j <= N; j++){
							if((i ^ j) <= N)
								count++;
						}
					}
					System.out.println(count);
				}
		
		}catch(IOException ex){
			
		}        
    }
}