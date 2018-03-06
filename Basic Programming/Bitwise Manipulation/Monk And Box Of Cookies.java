import java.io.*;
import java.util.*;
import java.math.*;
class MonkAndBoxOfCookies{
	public static void main(String args[] ) throws Exception 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int z=0;z<t;z++){
			int a[] = new int[32];
			int N = s.nextInt();
			for(int i=0;i<N;i++){
				long num = s.nextLong();
				for(int j=0;j<32;j++){
					if((num & 1<<j)!=0){
						a[j]++;
					}
				}
			}
			int max=a[0];
			int maxindex=0;
			for(int j=0;j<32;j++){
				if(a[j]>max){
					max=a[j];
					maxindex=j;
				}
			}
			System.out.println(maxindex);
		}
}
}