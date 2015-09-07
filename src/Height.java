import java.util.Scanner;


public class Height {
	
	private static int findHeight(int noofCycle) {
		int height=1;
		boolean flag =false;
		while ((noofCycle--)!=0) {
			if (!flag) {
				height = height * 2;
				flag = true;
			} else {

				height = height + 1;
				flag = false;
			}
		}
		return height;
		}
	
	
	public static void main(String [] agr){
	 Scanner in = new Scanner(System.in);
	 int testCase=in.nextInt();
	 while((testCase--)!=0)
	 {
		 int noofCycle=in.nextInt();
		 int height= findHeight(noofCycle);
		 System.out.println(height);	 
	 }
}

	


}