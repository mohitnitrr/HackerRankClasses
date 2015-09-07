
import java.util.Scanner;


public class FindDigits {

	public static void main(String[] args) {
	
		Scanner in= new Scanner(System.in);
		int testcases= in.nextInt();

		while(testcases--!=0){
		
		int number=in.nextInt();
		int numcons=number;
		int count=0;
		while(number>0){
	
			int value=number%10;
			
			number=number/10;
			if(value==0)
				continue;
			else if(numcons%value==0)
				count++;
			
		}
		System.out.println(count);
	  }
	}
}
