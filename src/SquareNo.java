import java.util.Scanner;


public class SquareNo {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testcase=in.nextInt();
		
		while(testcase--!=0){
			long first=in.nextLong();
			long second=in.nextLong();
			long a=(long)Math.ceil(Math.sqrt(first));
			long b=(long)Math.floor(Math.sqrt(second));
			int result=0;
			if(a==b)
				result++;
			else if(a*a==first||b*b==second)
				result+=b-a+1;
			else if(b>a)
				result+=b-a+1;		
			
			System.out.println(result);
		}
	}

}
