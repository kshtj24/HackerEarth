import java.util.*;

class TheDawn{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);		
		Long t = Long.parseLong(s.nextLine());
		
		ArrayList<Long> possibleSums = new ArrayList<Long>();
		for(Long i = 1L; i <= Math.sqrt(t); i++){
			if(t % i == 0)
			    possibleSums.add((t/i) + i);
		}
		System.out.println(min(possibleSums));
	}

	static Long min(ArrayList<Long> arr){
		Long min = 10000000000000L;
		for(int i = 0; i < arr.size(); i++){
			if(arr.get(i) < min)
				min = arr.get(i);
		}
		
		return min;
	}
}