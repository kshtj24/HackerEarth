import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class MonksLoveForFood {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> pile = new Stack<Integer>();
		int Q = Integer.parseInt(br.readLine());
		while(Q-- > 0){
			String[] query = br.readLine().split(" ");
			if(query[0].equals("1")){
				if(!pile.empty())
					System.out.println(pile.pop());
				else
					System.out.println("NO FOOD");
			}else{
				pile.push(Integer.parseInt(query[1]));
			}
		}
    }
}
