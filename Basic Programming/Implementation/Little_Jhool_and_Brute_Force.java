import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Little_Jhool_and_Brute_Force {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int cube[]={1729,4104,13832,20683,32832,39312,40033,46683,64232,65728,110656,110808,134379,
			149389,165464,171288,195841,216027,216125,262656,314496,320264,327763,373464,402597,439101,
			443889,513000,513856,515375,525824,558441,593047,684019,704977};
		int arr[]=new int[704978];
		arr[0]=-1;
		int k=0;
		for(int i=1;i<=704977;i++)
		{
			if(cube[k]<=i)
			{
				arr[i]=cube[k];
				k++;
			}
			else
			{
				arr[i]=arr[i-1];
			}
		}
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			int num=Integer.parseInt(br.readLine().trim());
			System.out.println(arr[num]);
		}
	}

}