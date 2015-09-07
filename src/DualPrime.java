import java.util.Scanner;


public class DualPrime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();

		while (testCases--!=0) {
			int count =0;
			int start = in.nextInt();
			int end = in.nextInt();
			for (int i = start; i <= end; i++) {
				if (isPrime(i)) {
					if (isPrime(sum(i))) {
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
	}

	private static int sum(int i) {
		int sum =0;
		while(i>0){
			sum+=i%10;
			i=i/10;
		}
		return sum ;
	}

	private static boolean isPrime(int i) {
		if(i==1)
			return false ;
		for(int j=2;j<=Math.sqrt(i);j++){
			if(i%j==0){
				return false;
			}
		}
		return true;
	}
}
