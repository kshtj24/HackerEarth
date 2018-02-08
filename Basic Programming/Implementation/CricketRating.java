import java.util.Scanner;
public class CricketRating {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rating = s.nextInt();
		int ratings[] = new int[rating];
		for(int i = 0; i < rating; i++){
			ratings[i] = s.nextInt();
		}
		int sum = 0;
		int i = 0;
		int temp = 0;
		for(i = 0; i < rating; i++){
			temp = temp+ratings[i];
			if(temp >sum){
				sum=temp;
			}
			if(temp<0){
				temp = 0;
			}
		}
		System.out.println(sum);
	}
}