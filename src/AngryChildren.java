import java.util.Arrays;
import java.util.Scanner;


public class AngryChildren {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num= in.nextInt();
		int[] candies=new int[num];
		int k=in.nextInt();
		for(int i=0;i<num;i++){
			
			candies[i]=in.nextInt();
			
		}
		
		Arrays.sort(candies);
		int min=candies[num-1];
		int nextmin; 
		for(int j=0;j<num-k+1;j++){
			
			nextmin=candies[j+k-1]-candies[j];
			if(nextmin<min)
				min=nextmin;
		}
	
	System.out.println(min);
	}
	
}
