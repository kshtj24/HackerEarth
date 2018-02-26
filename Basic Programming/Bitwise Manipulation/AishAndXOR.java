import java.io.*;

class AishAndXOR{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			int[] arr = convertAll(br.readLine().split(" "));
			int Q = Integer.parseInt(br.readLine());
			
			while(Q-- > 0){
				int[] L_R = convertAll(br.readLine().split(" "));
				int XOR = 0;
				int unsetCount = 0;
				for(int i = L_R[0] - 1; i <= L_R[1] - 1; i++){
					XOR ^= arr[i];
					if(arr[i] == 0)
						unsetCount++;
				}
				System.out.println(XOR + " " + unsetCount);
			}
		}catch(IOException ex){}
	}
	
	static int[] convertAll(String[] arr){
		int[] returnable = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			returnable[i] = Integer.parseInt(arr[i]);
		}
		
		return returnable;
	}
}