import java.io.*;
import java.util.*;

class MonkAndHisFather{
    public static void main(String[] args){
		try{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T  = Integer.parseInt(br.readLine());
			while(T-- > 0){
				char[] binaryOfP = (Long.toBinaryString(Long.parseLong(br.readLine()))).toCharArray();
				int count = 0;
				for(char c : binaryOfP){
					count += c == '1'? 1 : 0;
				}
		    System.out.println(count);
			}		    
		}catch(IOException ex){
			
		}        
    }
}