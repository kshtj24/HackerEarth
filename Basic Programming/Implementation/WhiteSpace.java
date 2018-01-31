import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class WhiteSpace{

	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		char[] chars = s.toCharArray();
		int count = 0;
		for(int i = 0; i < chars.length; i++){
			if(chars[0] == ' '){
				count++;
			}
		}

		System.out.println(count);
	}
}


