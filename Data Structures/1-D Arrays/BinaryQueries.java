import java.io.*;

class BinaryQueries{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] token = br.readLine().split(" ");
		int N = Integer.parseInt(token[0]);
		int Q = Integer.parseInt(token[1]);
		String[] str = br.readLine().split(" ");
		
		while(Q-- > 0){
			String[] query = br.readLine().split(" ");
			if(query[0].equals("0")){
				System.out.println(str[Integer.parseInt(query[2]) - 1].equals("1") ? "ODD" : "EVEN");
			}else{
				str[Integer.parseInt(query[1]) - 1] = str[Integer.parseInt(query[1]) - 1].equals("1") ? "0" : "1";
			}
		}
	}
}