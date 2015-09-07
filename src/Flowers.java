import java.util.Arrays;
import java.util.Scanner;


public class Flowers {
	
	 public static void main( String args[] ){
	      
		// helpers for input/output      

		      Scanner in = new Scanner(System.in);
		      
		      int N, K;
		      N = in.nextInt();
		      K = in.nextInt();
		      
		      int C[] = new int[N];
		      for(int i=0; i<N; i++){
		         C[i] = in.nextInt();
		          
		      }
		      
		       
		      int result = minCost(C,K,N);
		      System.out.println( result );
		      
		   }

	private static int minCost(int[] c,int noOfPlayer,int size) {
		Arrays.sort(c);
		int cost=0;
		int end=size;
		int x=0;
		for(int j=0;j<size;j++){
		
			for(int i=0;i<noOfPlayer;i++){
				if(end==0)
					break;
				cost=cost+(x+1)*c[--end];
		}
	
		
		
			x++;
		}
		return cost;
	}

}
