import java.io.*;

//odd numbers have 1 at the end of the binary representation. thus counting 1s will be enough
class MicroAndBinaryStrings{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			while(T-- > 0){
				int N = Integer.parseInt(br.readLine());
				String S = br.readLine();
				
				int count = 0;
				for(int i = 0; i < S.length(); i++){
					if(S.charAt(i) == '1')
						count++;
				}
				System.out.println(count);
			}
		}catch(IOException ex){
			
		}
	}
}