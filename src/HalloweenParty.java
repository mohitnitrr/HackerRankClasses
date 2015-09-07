import java.math.BigInteger;
import java.util.Scanner;


public class HalloweenParty {
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		  
	      int testcase=Integer.parseInt(in.nextLine());
	      
	      while (testcase--!=0) {
	    	  	int pieces;
	    	  	int lines =Integer.parseInt(in.nextLine());
	    	  	if(lines%2==0)
	    	  		pieces=(lines/2)*(lines/2);
	    	  	else
	    	  		pieces=(lines/2)*(lines/2)+(lines/2);
	    	  	
	    	  	System.out.println(pieces);
	    	  		
	      }
}
}
