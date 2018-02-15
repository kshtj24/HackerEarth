import java.io.*;
import java.util.*;

class HihiAndCrazyBits{
    public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			for(int t = 0; t < T; t++){
				long N = Long.parseLong(br.readLine());
				if((N & 1) == 1){
					for(long i = N + 1; ; i++){
						if((N & i) == N){
							System.out.println(i);
							break;
						}
					}
				}else{
					System.out.println(N + 1);
				}
			}
		}catch(IOException ex){
			
		}        
    }
}