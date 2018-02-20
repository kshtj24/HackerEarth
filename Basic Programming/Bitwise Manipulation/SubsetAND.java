import java.io.*;

class SubsetAND{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			while(T -- != 0){
				int[] ZN = convertAll(br.readLine().split(" "));
				int[] array = convertAll(br.readLine().split(" "));
				boolean flag = true;
				for(int i = 0; i < array.length; i++){
					if((ZN[0]&= array[i]) == 0){
						System.out.println("Yes");
						flag = false;
						break;
					}
				}
				if(flag)
					System.out.println("No");
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