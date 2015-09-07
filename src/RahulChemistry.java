import java.util.Scanner;


public class RahulChemistry {
	private static final int Mod=1000000007;
	private static int[] weightArray;
	private static int sum;
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int length= in .nextInt();
		weightArray = new int[length];
		int i=0;
		while(length--!=0){
			weightArray[i++]=in.nextInt();
		}
		int sum=0;
		//int previous=0;
		//int next=2;
		//int pos=1;
		//int j=0;
		/*while(j<=length-1){
			if(weightArray[previous]>weightArray[next]){
				sum=sum+pos+weightArray[next];
				next++;
			}
			else{
				sum=sum+pos+weightArray[previous];
			}
		}*/
		
		sum=minimunCost(0,length-1);
		System.out.println(sum);
		
	}
	private static int minimunCost(int i, int j) {
		if(i==j)
			return weightArray[i];
		else if(j==i+1)
			return weightArray[i]+weightArray[j];
		else
			if(weightArray[i]<minimunCost(i+1, j)){}
		//		return weightArray+minimunCost(i+1, j);
		//	else
			
			//return min(weightArray[i]+minimunCost(i+1, j),weightArray[i]+weightArray[i+1]+)
		return 0;
	}

}
