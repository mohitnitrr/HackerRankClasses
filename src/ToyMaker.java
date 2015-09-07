import java.util.Arrays;
import java.util.Scanner;


public class ToyMaker {
	
	  public static void main(String[] args) {
	        Scanner stdin=new Scanner(System.in);
	        int n=stdin.nextInt(),k=stdin.nextInt();
	        int prices[]=new int[n];
	        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
	        
	        int answer = maxToys(prices,n,k);
	        // Compute the final answer from n,k,prices 
	        System.out.println(answer);
	    
	  }
	private static int maxToys(int[] prices,int size,int sum) {
		int count=0;
		int countsum=0;
		Arrays.sort(prices);
		for(int i=0;countsum<sum&&i<size-1;i++){
			if((prices[i]+countsum)<sum){	
				count++;
				countsum+=prices[i];
			}
		}
		return count;
	}

}
