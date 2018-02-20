import java.io.*;

class PowerOf2{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			int ans = 0;
			while(N-- > 0){				
				long m = Long.parseLong(br.readLine());
				while(m!=1){
					if(m%2!=0) 
						break;
					m=m/2;
				}
				if(m==1) ans++;
				}				
			
			System.out.println(ans);
		}catch(IOException ex){
			System.out.println("Exception");
		}
	}
}

//	if(m != 1L){
//					for(long i = 0; i <= 32; i++){
//						System.out.println(2L << i);
//						if((2 << i) == m){
//							count++;
//							break;
//						}
//					}
//				}else{
//					count++;
//				}
