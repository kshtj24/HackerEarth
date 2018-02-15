import java.io.BufferedReader;
import java.io.InputStreamReader;

class Mystery{
	
	public static void main(String[] args){
		try{
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			while(true){
				String s = br.readLine();
				if(!s.isEmpty()){
					long num = Long.parseLong(s);
					long count = 0;
					while(num != 0){
						if((num & 1) == 1)
							count++;
						num = num >> 1;
					}
				System.out.println(count);
				}else{
					break;
				}
			}
		}catch(Exception ex){
			
		}		
	}
}