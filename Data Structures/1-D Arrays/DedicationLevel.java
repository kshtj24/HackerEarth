import java.io.BufferedReader;
import java.io.InputStreamReader;

class DedicationLevel {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] names = new String[N];
		int[] hours = new int[N];
		
		for(int i = 0; i < N; i++){
			String[] token = br.readLine().split(" ");
			names[i] = token[0];
			hours[i] = Integer.parseInt(token[1]);
		}
		
		for(int t = 0; t < 3; t++){
			int maxHour = 0;
			int maxHourLoc = 0;
			for(int i = 0; i < N; i++){
				if(hours[i] > maxHour){
					maxHour = hours[i];
					maxHourLoc = i;
				}
			}
			System.out.println(names[maxHourLoc]);
			hours[maxHourLoc] = 0;
		}
    }
}
