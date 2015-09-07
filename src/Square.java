import java.util.Scanner;


public class Square {
	   public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			  
		      int testcase=Integer.parseInt(in.nextLine());
		      
	        while (testcase--!=0) {
	            
	            
		      int seconds=Integer.parseInt(in.nextLine());
		      int lines=4;
	            
		      if( seconds==0){}
		    	
		      else
	          lines=power(seconds);
	          
	          System.out.println(lines);
	          
	        }    
	    
	}

	private static int power(int seconds) {
		int pow=1;
		int result=4;
		int mod=1000000007;
		for(int i=1;i<=seconds;i++){
		pow=pow*2;
		if(pow>mod)
		pow=pow%mod;
		result+=pow;
		if(result>mod)
			result=result%mod;
		}
		return result;
	}

}
