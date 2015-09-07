import java.util.Scanner;


public class ChocolateFeast {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcase=in.nextInt();
		      
			while (testcase--!=0) {
				int money=in.nextInt();
				int cost=in.nextInt();
				int rem=in.nextInt();
				int choco=money/cost;
				
				int wrapper=money/cost;
				
				while(wrapper>=rem){
					choco+=wrapper/rem;
					wrapper=wrapper/rem+wrapper%rem;
				}
			    System.out.println(choco);

			}
	   
  }
}
