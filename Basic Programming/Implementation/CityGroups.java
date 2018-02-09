import java.util.*;
class CityGroups{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();		
		s.nextLine();
		
		ArrayList<int[]> cityGroups = new ArrayList<int[]>();		
		for(int i = 0; i < K; i++){
			cityGroups.add(convertAll(s.nextLine().split(" ")));
		}
		
		int Q = Integer.parseInt(s.nextLine());
		
		for(int q = 0; q < Q; q++){			
			int X = s.nextInt();
			int Y = s.nextInt();
			
			int[] xyGroup = findGroups(X,Y,cityGroups);
			
			if(xyGroup[0] == xyGroup[1])
				System.out.println(0);
			else if((xyGroup[0] == 0 && xyGroup[1] == (K - 1)) || (xyGroup[1] == 0 && xyGroup[0] == (K - 1))){
				System.out.println(1);
			}
			else{
				System.out.println(Math.abs(xyGroup[1] - xyGroup[0]));
			}
			s.nextLine();
		}		
	}
	
	static int[] findGroups(int X, int Y, ArrayList<int[]> cityGroups){
		int[] xyGroup = new int[2];
		
		for(int i = 0; i < cityGroups.size(); i++){
			int[] group = cityGroups.get(i);
			for(int j = 0; j < group.length; j++){
				if(group[j] == X){
					xyGroup[0] = i;
				}
				else if(group[j] == Y){
					xyGroup[1] = i;
				}
			}
		}
		
		return xyGroup;
	}
	
	static int[] convertAll(String[] args){
		int[] returnable = new int[args.length];
		for(int i = 0; i < args.length; i++){
			returnable[i] = Integer.parseInt(args[i]);
		}
		return returnable;
	}
}