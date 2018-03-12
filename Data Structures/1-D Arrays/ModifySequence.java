import java.io.BufferedReader;
import java.io.InputStreamReader;

//here we need to join all the digits given and check if the resultant number is a multiple of 11. is yes. output YES.
class ModifySequence {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		
		int tempNum = 0;
		for(int i = N - 1; i >=0; i-=2){
			tempNum += Integer.parseInt(arr[i]);
		}
		
		for(int j = N - 2; j >= 0;j-=2){
			tempNum -= Integer.parseInt(arr[j]);
		}
		
		System.out.println(tempNum % 11 == 0 ? "YES" : "NO");
    }
}
