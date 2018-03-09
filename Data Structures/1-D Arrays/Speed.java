import java.io.BufferedReader;
import java.io.InputStreamReader;


class Speed {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0){
			int N = Integer.parseInt(br.readLine());
			String[] carSpeeds = br.readLine().split(" ");
			int count = 0;
			int maxSpeed = Integer.parseInt(carSpeeds[0]);
			for(int n = 0; n < N; n++){
				if(Integer.parseInt(carSpeeds[n]) <= maxSpeed){
					count++;
					maxSpeed = Integer.parseInt(carSpeeds[n]);
				}
			}
			System.out.println(count);
		}
    }
}
