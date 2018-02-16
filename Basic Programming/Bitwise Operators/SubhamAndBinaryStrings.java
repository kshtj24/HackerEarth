import java.io.*;
import java.util.*;

class SubhamAndBinaryStrings{
    public static void main(String[] args){
		try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int T = Integer.parseInt(br.readLine());
				for(int t = 0; t < T; t++){
					int N = Integer.parseInt(br.readLine());
					String binStr = br.readLine();
					int count = 0;
					for(int i = 0; i < binStr.length(); i++){
						if(binStr.charAt(i) == '0')
							count++;
					}
					System.out.println(count);				
				}
		}catch(IOException ex){
			
		}        
    }
}