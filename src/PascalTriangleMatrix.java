import java.util.Scanner;


public class PascalTriangleMatrix {

	private static int MAXSIZE=1002;
	private static final int MOD =1000000000;
	private static int[][] values = new int[MAXSIZE][MAXSIZE];
	
	public static void main(String[] args) {
		
		fillPascaltriangle();
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
		while(testcases--!=0){
			int row =in.nextInt();
			for(int i=0;i<=row;i++){
				System.out.print(values[row][i] + " ");
			}
			System.out.println();
		}
	}
	private static void fillPascaltriangle() {
		values[0][0]=1;
		
		for(int i=1;i<MAXSIZE-1;i++){
			
			for(int j=0;j<=i;j++){
				
				if(j==0){
					values[i][j]=1;
				}
				else{
					values[i][j]=(values[i-1][j-1] % MOD +values[i-1][j] % MOD) % MOD;
				}
				
			}
		}
	}
}
