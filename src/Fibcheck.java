import java.math.BigInteger;
import java.util.Scanner;


public class Fibcheck {
	
	 public static void main(String[] args) {
			Scanner in= new Scanner(System.in);
			int testcases= in.nextInt();

			while(testcases--!=0){
				
				long number=in.nextLong();
				double r1=Math.sqrt(5*number*number+4)%1;
				double r2=Math.sqrt(5*number*number-4)%1;
				
				if(r1==0)
					System.out.println("IsFibo");
				else if(r2==0)
					System.out.println("IsFibo");
				else 
					System.out.println("IsNotFibo");
			}
		}

}
