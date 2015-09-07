import java.util.Scanner;


public class PascalTriangle {

	private static final int MOD =1000000000;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();

		while(testcases--!=0){
			long row = in.nextLong();
			long number = 1;
			for(long j=0;j<=row;j++) {
				System.out.print(number + " ");
				number = ((number * (row - j)) / (j + 1)) % MOD;
			}
			System.out.println();
		}

	}
}

