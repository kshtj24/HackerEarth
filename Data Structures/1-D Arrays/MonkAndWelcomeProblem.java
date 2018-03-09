import java.io.*;
import java.util.*;

class MonkAndWelcomeProblem{
    public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.nextLine());
		String[] Ai = s.nextLine().split(" ");
		String[] Bi = s.nextLine().split(" ");
		for(int i = 0; i < N; i++){
			System.out.print((Integer.parseInt(Ai[i]) + Integer.parseInt(Bi[i])) + " "); 
		}      
    }
}