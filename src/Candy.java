import java.util.Scanner;


public class Candy {
	private static final int Mod=1000000007;
	
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	int testcase= in.nextInt();
	
	while(testcase--!=0){
		
	int dukan=in.nextInt();
	int friend=in.nextInt();
	int tarike=(combination(dukan,friend)+friend)%Mod;
	System.out.println(tarike);
	
	}
}

	private static int combination(int dukan, int friend) {
		int tarike =1;
		for(int i=0;i<=friend;i++){
			tarike=(tarike*dukan)%Mod;
			dukan--;
	}
	return tarike;
	}
}