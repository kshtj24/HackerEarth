import java.io.BufferedReader;
import java.io.InputStreamReader;

class MarkTheAnswer {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tokens = br.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int X = Integer.parseInt(tokens[1]);
		String[] questions = br.readLine().split(" ");
		
		int skips = 1;
		int maxScore = 0;
		for(int i = 0; i < N; i++){
			if(Integer.parseInt(questions[i]) <= X){
				maxScore++;
			}else if(skips > 0){
				skips--;
			}else
				break;
		}
		System.out.println(maxScore);
    }
}
